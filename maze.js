$(document).ready(function() {
  $("#start").click(startClick);
  $("#end").mouseover(mouseOverEnd);
  $(".boundary").mouseover(mouseOverOnBoundry);
  $("#maze").mouseleave(mouseOverOnBoundry);
});
var isStart = 0;
var startClick = function() {
  isStart = 1;
  $(".boundary").css({ background: "#eeeeee" });
  isStart = 1;
};

var mouseOverOnBoundry = function() {
  if (isStart === 1) {
    $(".boundary").css({ background: "#FAA" });
    $(".boundary").off("mouse-over");
    isStart = 0;
    $("#status").text("You lose!");
  }
};

var mouseOverEnd = function() {
  if (isStart === 1) {
    $("#status").text("You won!");
  }
  isStart = 0;
  $(".boundary").off("mouse-over");
};
