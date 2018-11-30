import scala.util.Try
import cats.implicits._

import scala.concurrent.duration.Duration

def parseDouble(s: String): Either[String, Double] =
  Try(s.toDouble).toEither.leftMap(_ => s"$s is not a number")

def divide(a: Double, b: Double): Either[String, Double] =
  Either.cond(b != 0, a / b, "Cannot divide by zero")

def divisionProgram(inputA: String, inputB: String): Either[String, Double] =
  for {
    a <- parseDouble(inputA)
    b <- parseDouble(inputB)
    result <- divide(a, b)
  } yield result

divisionProgram("4", "2")

divisionProgram("a", "b")

divisionProgram("2", "0")

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.concurrent.Await

def parseDoubleAsync(s: String): Future[Either[String, Double]] =
  Future.successful(parseDouble(s))

def divideAsync(a: Double, b: Double): Future[Either[String, Double]] =
  Future.successful(divide(a, b))

def divisionProgramAsync(inputA: String, inputB: String): Future[Either[String, Double]] =
  parseDoubleAsync(inputA) flatMap { eitherA =>
    parseDoubleAsync(inputB) flatMap { eitherB =>
      (eitherA, eitherB) match {
        case (Right(a), Right(b)) => divideAsync(a, b)
        case (Left(err), _) => Future.successful(Left(err))
        case (_, Left(err)) => Future.successful(Left(err))
      }
    }
  }

Await.result(divisionProgramAsync("4", "2"), Duration.Inf)

Await.result(divisionProgramAsync("a", "b"), Duration.Inf)

Await.result(divisionProgramAsync("2", "0"), Duration.Inf)

import cats.data.EitherT

def divisionProgramAsync2(inputA: String, inputB: String): EitherT[Future, String, Double] =
  for {
    a <- EitherT(parseDoubleAsync(inputA))
    b <- EitherT(parseDoubleAsync(inputB))
    result <- EitherT(divideAsync(a, b))
  } yield result

Await.result(divisionProgramAsync2("4", "2").value, Duration.Inf)

Await.result(divisionProgramAsync2("a", "b").value, Duration.Inf)

Await.result(divisionProgramAsync2("2", "0").value, Duration.Inf)
