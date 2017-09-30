# Angular 2 with Spring boot

Sample Java project which integrate Angular 2 with Spring boot.


## Requirements:

 * Nodejs 4 + installed;
 * Java 8 installed;
 * Maven installed


## Installation

  * Clone the project from github
  `https://github.com/mauriciolassakoski/angular_2_springboot.git`

#### Download project dependencies

Maven dependencies
  * cd angular_2_springboot;
  * `mvn clean install`;

**ps:** when you run `mvn clean install` or `mvn spring-boot:run`will also be executed `npm install` and `npm run build`  on frontend package. You can only start the application and access ***htto://localhost:8081/***


###Frontend dependencies

  * cd frontend
  * `npm install`


## Usage

* Execute `ng build` on frontend folder. (this command will build frontend and output files into "src/main/resources/static"). You can also use `ng build --watch` to auto copy your files into static folder when you modify it.
* On root application directory execute `mvn spring-boot:run`


## Usage (Run frontend on nodejs and backend with spring-boot)

You can start the frontend by *angular-cli* using `npm start` inside frontend folder (it is recomended if you will be working only in frontend).
The command `ng serve` will not work because frontend will be running on port 4200 and the backend will be running on port 8081.  I created a proxy file to be used by `npm start` and allow this communication.


## Contributing

1. Fork it!
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -am 'Add some feature'`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request ;p


## Credits

* Mauricio Lassakoski


## License

* MIT
