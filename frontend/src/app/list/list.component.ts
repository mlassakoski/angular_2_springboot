import { Component, OnInit } from '@angular/core';
import { Http } from '@angular/http';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent {

  courses: string[];

  constructor(http: Http) {
  
    http.get('api/courses')
      .map(res => res.json())
      .subscribe(
        courses => this.courses = courses,
        err => console.log(err)
      );
  }
}
