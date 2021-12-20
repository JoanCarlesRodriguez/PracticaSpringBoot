const path = require('path');
const gulp = require('gulp');
const sass = require('gulp-sass')(require('sass'));
const {series} = require('gulp');




function sassCompilador() {
    return gulp.src('./src/main/resources/static/scss/*.scss')
        .pipe(sass().on('error', sass.logError))
        .pipe(gulp.dest('./src/main/resources/static/css'));
}
function copy (){
    return gulp.src('./node_modules/bootstrap/dist/js/*')
        .pipe(gulp.dest('./src/main/resources/static/js'));
}



exports.compilar = sassCompilador
exports.build = series(sassCompilador, copy);
