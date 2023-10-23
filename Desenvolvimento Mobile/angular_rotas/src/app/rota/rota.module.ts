import { NgModule } from "@angular/core";

import { CommonModule } from "@angular/common";
import { RotaChildComponent } from './rota-child/rota-child.component';
import { RotaChild2Component } from './rota-child2/rota-child2.component';
import { RotaComponent } from "./rota.component";
import { RotaRoutingModule } from "./rota.routing.module";

@NgModule({
   imports: [CommonModule, RotaRoutingModule],
   declarations: [RotaComponent, RotaChildComponent, RotaChild2Component,],
})

export class RotaModule { }