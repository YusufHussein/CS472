"use strict";
(function () {
    window.onload = function () {
        document.getElementById("start").onclick = startFunctionality;
        document.getElementById("stop").onclick = stopTimer;
        document.getElementById("animation-size").onchange = animationSizeSelectEvent;
        document.getElementById("cbSpeed").onchange = speedChange;
        speed = 250;
    };
    let index = 0;
    let speed;
    let sp;
    let timer;
    function startFunctionality() {
        let selectAnimType = document.getElementById("animation-type");
        let type = selectAnimType.options[selectAnimType.selectedIndex].text;
        let value = ANIMATIONS[ type];
        sp = value.split("=====\n");
        index = 0;

        document.getElementById("start").disabled = true;
        document.getElementById("stop").disabled = false;

        selectAnimType.disabled = true;
        animationSizeSelectEvent();
        startTimer(sp);

    }

    
    function startTimer(sp) {
        timer = setInterval(function () {
            if (index < sp.length)
            {
                let textArea = document.getElementById("textArea");
                textArea.innerHTML = sp[index];
                index++;
            } else {
                index = 0;
            }
        }, speed);
    }
    function stopTimer() {
        clearInterval(timer);
        timer = null;

        document.getElementById("start").disabled = false;
        document.getElementById("stop").disabled = true;

        document.getElementById("animation-type").disabled = false;
    }
    function animationSizeSelectEvent() {
        let selectAnimSize = document.getElementById("animation-size");
        let type = selectAnimSize.options[selectAnimSize.selectedIndex].text;
        document.getElementById("textArea").style.fontSize = FONT_SIZE[type];

    }

    function speedChange() {
        if (speed === 250) {
            speed = 50;
        } else {
            speed = 250;
        }
        if (timer !== null) {
            clearInterval(timer);
            startTimer(sp);
        }
    }
}());