import { Component, OnInit } from '@angular/core';

import { Hero } from './hero';

import { HeroService } from './hero.service';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  //template: `<h1>{{title}}</h1><h2>{{hero.name}} details!</h2>`,
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  heros : Hero[];

  constructor(private heroService: HeroService) {

  }

  ngOnInit(): void {

    this.heroService.getHeroes().then(heroes => this.setInfo(heroes) );

  }

  private setInfo(heroes:Hero[] ) {
    this.heros = heroes;
    this.hero = heroes[3];
  }


  title = 'Tour of Heroes';
  hero: Hero ;
  selectedHero: Hero;




  onSelect(hero: Hero): void {
    this.selectedHero = hero;
  }
}



