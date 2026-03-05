var SCISSORS = '가위';
var ROCK = '바위';
var PAPER = '보';

function onButtonClick(userInput) {
  console.log('사용자의 패: ' + userInput);
  var comInput;
  var rnd = Math.random();

  if (rnd < 0.33) {
    comInput = SCISSORS;
  } else if (rnd < 0.66) {
    comInput = ROCK;
  } else {
    comInput = PAPER;
  }

  var result = '내 패: ' + userInput + ', 컴퓨터 패: ' + comInput;

  if (userInput == SCISSORS) {
    if (comInput == SCISSORS) {
      result += ' - 비겼습니다.';
    } else if (comInput == ROCK) {
      result += ' - 패배...🥹';
    } else {
      result += ' - 승리!🥳';
    }
  } else if (userInput == ROCK) {
    if (comInput == ROCK) {
      result += ' - 비겼습니다.';
    } else if (comInput == PAPER) {
      result += ' - 패배...🥹';
    } else {
      result += ' - 승리!🥳';
    }
  } else {
    if (comInput == PAPER) {
      result += ' - 비겼습니다.';
    } else if (comInput == SCISSORS) {
      result += ' - 패배...🥹';
    } else {
      result += ' - 승리!🥳';
    }
  }

  alert(result);
}
