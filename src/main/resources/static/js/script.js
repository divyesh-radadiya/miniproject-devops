function clearScreen1() {
 document.getElementById("result1").value = "";
}

function clearScreen2() {
 document.getElementById("result2").value = "";
}

var base="http://localhost:8081";
// var base="http://172.16.134.139:8081";


function speedConverter12() {
    const to = document.getElementById("speedTo").value;
    const from = document.getElementById("speedFrom").value;
    const val = document.getElementById("result1").value;

    fetch(base+'/getSpeed', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json;charset=utf-8'
        },
        body: JSON.stringify({
            to:to.toString(),
            from:from.toString(),
            val:val.toString()
        })
    }).then(response => response.json())
        .then((data) => {
            document.getElementById("result2").value = data;
        });
}

function speedConverter21() {
    const from = document.getElementById("speedTo").value;
    const to = document.getElementById("speedFrom").value;
    const val = document.getElementById("result2").value;

    fetch(base+'/getSpeed', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json;charset=utf-8'
        },
        body: JSON.stringify({
            to:to.toString(),
            from:from.toString(),
            val:val.toString()
        })
    }).then(response => response.json())
        .then((data) => {
            document.getElementById("result1").value = data;
        });
}

function temperatureConverter12() {
    const to = document.getElementById("speedTo").value;
    const from = document.getElementById("speedFrom").value;
    const val = document.getElementById("result1").value;

    fetch(base+'/getTemperature', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json;charset=utf-8'
        },
        body: JSON.stringify({
            to:to.toString(),
            from:from.toString(),
            val:val.toString()
        })
    }).then(response => response.json())
        .then((data) => {
            document.getElementById("result2").value = data;
        });
}

function temperatureConverter21() {
    const from = document.getElementById("speedTo").value;
    const to = document.getElementById("speedFrom").value;
    const val = document.getElementById("result2").value;

    fetch(base+'/getTemperature', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json;charset=utf-8'
        },
        body: JSON.stringify({
            to:to.toString(),
            from:from.toString(),
            val:val.toString()
        })
    }).then(response => response.json())
        .then((data) => {
            document.getElementById("result1").value = data;
        });
}

function weightConverter12() {
    const to = document.getElementById("speedTo").value;
    const from = document.getElementById("speedFrom").value;
    const val = document.getElementById("result1").value;

    fetch(base+'/getWeight', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json;charset=utf-8'
        },
        body: JSON.stringify({
            to:to.toString(),
            from:from.toString(),
            val:val.toString()
        })
    }).then(response => response.json())
        .then((data) => {
            document.getElementById("result2").value = data;
        });
}

function weightConverter21() {
    const from = document.getElementById("speedTo").value;
    const to = document.getElementById("speedFrom").value;
    const val = document.getElementById("result2").value;

    fetch(base+'/getWeight', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json;charset=utf-8'
        },
        body: JSON.stringify({
            to:to.toString(),
            from:from.toString(),
            val:val.toString()
        })
    }).then(response => response.json())
        .then((data) => {
            document.getElementById("result1").value = data;
        });
}

function lengthConverter12() {
    const to = document.getElementById("speedTo").value;
    const from = document.getElementById("speedFrom").value;
    const val = document.getElementById("result1").value;

    fetch(base+'/getLength', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json;charset=utf-8'
        },
        body: JSON.stringify({
            to:to.toString(),
            from:from.toString(),
            val:val.toString()
        })
    }).then(response => response.json())
        .then((data) => {
            document.getElementById("result2").value = data;
        });
}

function lengthConverter21() {
    const from = document.getElementById("speedTo").value;
    const to = document.getElementById("speedFrom").value;
    const val = document.getElementById("result2").value;

    fetch(base+'/getLength', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json;charset=utf-8'
        },
        body: JSON.stringify({
            to:to.toString(),
            from:from.toString(),
            val:val.toString()
        })
    }).then(response => response.json())
        .then((data) => {
            document.getElementById("result1").value = data;
        });
}


