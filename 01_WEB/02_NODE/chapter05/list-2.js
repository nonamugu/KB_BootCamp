const fs = require('fs');
fs.readdir('./', (err, files) => {
  // './'는 현재 디렉토리를 의미
  if (err) {
    console.error(err);
    return;
  }
  console.log(files);
});

fs.readdir(__dirname, (err, files) => {
  // __dirname은 현재 파일이 있는 디렉토리의 절대 경로
  if (err) {
    console.error(err);
    return;
  }
  console.log(files);
});
