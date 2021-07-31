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
   tweeter: Tweet = {idUser:0, userName: "", userLocation:"", userDescription:"", userCreated:"", userFollowers:0, userFriends:0, userFavourites:"", userVerified:"", text:"", hashtags:"", source:"", isRetweet:""};
//,
  tweeters: Tweet []= [];
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


  tenTweets() {
    this.compteur++;
    this.testService.getTenTweets().subscribe(data => {
     this.tweeters = data;
     console.log(data);

   });
  }


}
