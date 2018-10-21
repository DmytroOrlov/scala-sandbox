A = [4, 2];

function Tt(a, i){
    this.a = a;
    this.i = i;
}

Tt.prototype.value = function() {
    return this.a[this.i];
};

function solution(A) {
    var foo = [];
    for (var i = 0; i<A.length; i++) {
        foo.push(new Tt(A, i));
    }
    return foo;
}

T = solution(A);

T[0].value();
