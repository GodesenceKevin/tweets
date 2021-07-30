import { typeWithParameters } from '@angular/compiler/src/render3/util';
import { Component } from '@angular/core';
import {TestApiRequestService} from './test-api-request.service';
import { Tweet } from './tweet';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'EPSI - POEC -- ATELIER JAVA';
  compteur = 0;
  private testService: TestApiRequestService;
   tweeter: Tweet = {idUser:0, userName: "", userLocation:""};
  //userTweet: Tweet ;

  constructor(testApiRequestService:TestApiRequestService) {
    this.testService = testApiRequestService;
  }

  increment(){
    this.compteur++;
     this.testService.getTweets().subscribe(data => {
      this.tweeter = data;
      console.log(this.tweeter);
      
    });
    return this.compteur;
  }


  decrement(){
    return --this.compteur;
  }


}
