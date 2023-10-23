import { NgModule } from "@angular/core";
import { RouterModule } from "@angular/router";
import { RotaChildComponent } from "./rota-child/rota-child.component";
import { RotaChild2Component } from "./rota-child2/rota-child2.component";
import { RotaComponent } from "./rota.component";

const rotaRoutes = [
   {path: 'rota', component: RotaComponent},
   {path: 'rota/child', component: RotaChildComponent},
   {path: 'rota/child2', component: RotaChild2Component}
];

@NgModule({
   imports: [RouterModule.forChild(rotaRoutes)],
   exports: [RouterModule]
})

export class RotaRoutingModule {}