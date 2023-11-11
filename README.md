![imagen](https://github.com/alejandrorubio29/App-WhatsDAM.-Sprint-2/assets/145864071/497cb866-9e7b-4f6f-a473-2d041b7343a2)# App-WhatsDAM.-Sprint-2

En aquest sprint l'aplicació implementa un RecyclerView en forma de missatges a la dreta a mesura que premem el botó de la fletxa. 

## 1. Definició del dataset

Definim el dataclass
 ![imagen](https://github.com/alejandrorubio29/App-WhatsDAM.-Sprint-2/assets/145864071/a8f78c8d-a915-4da3-a566-a00af1974a72)

Definim les propietats
 ![imagen](https://github.com/alejandrorubio29/App-WhatsDAM.-Sprint-2/assets/145864071/bbb79590-b0ee-4d1a-9969-834cb4d81156)

Definim el dataset com a objecte
![imagen](https://github.com/alejandrorubio29/App-WhatsDAM.-Sprint-2/assets/145864071/e82f6ca3-23b6-4120-99e7-2717a8c3d8cd)

## 2. Creació de la classe ViewHolder

Els elements als quals referenciar son:
 ![imagen](https://github.com/alejandrorubio29/App-WhatsDAM.-Sprint-2/assets/145864071/1598a74f-f9ce-4f22-8885-ff67ab694ec6)

Implementem la instanciació a les subvistes:

![imagen](https://github.com/alejandrorubio29/App-WhatsDAM.-Sprint-2/assets/145864071/b29a4f90-6b7d-4d16-9845-f9ca5beeb1e7)

I a continuació fem el bind considerant la questió del timestamp 

![imagen](https://github.com/alejandrorubio29/App-WhatsDAM.-Sprint-2/assets/145864071/1590c99e-54de-47d9-a06c-eb1230142424)

## 3. Creació de l'adaptador
![imagen](https://github.com/alejandrorubio29/App-WhatsDAM.-Sprint-2/assets/145864071/5664c0f5-6ea5-4c6f-9b41-0c7ca9760527)

Aprofitem l’ajuda d’Android studio per a implementar els métodes

![imagen](https://github.com/alejandrorubio29/App-WhatsDAM.-Sprint-2/assets/145864071/ed5af630-2200-49ee-9414-ea9d450dd731)

Implementem cada métode considerant la notació i que fem referència al viewholder de my_msg

![imagen](https://github.com/alejandrorubio29/App-WhatsDAM.-Sprint-2/assets/145864071/d733cf9a-52a1-4312-b160-f67a923ae1b8)

## 4. Adaptació de copdo en main activity

Finalment resta implementar tota la lógica en MessagesActicity. Primer, afegim el RecyclerView al layout de messages_window:

![imagen](https://github.com/alejandrorubio29/App-WhatsDAM.-Sprint-2/assets/145864071/cff18f0c-ef7b-4e70-a5fd-4e7022bbf197)

(Nota: aci he comes una errada al definir layout_height a 0dp ja que els missatges es mostrarán de "altura 0". Després ho arregle)

Establim el manager, la gradària i connectem el adaptador:
 ![imagen](https://github.com/alejandrorubio29/App-WhatsDAM.-Sprint-2/assets/145864071/2e1c44f3-ec8c-4096-b2c2-a98697be16f0)

## 5.Modificació del botó de enviament de missatges per a afegir missatge a llista

 ![imagen](https://github.com/alejandrorubio29/App-WhatsDAM.-Sprint-2/assets/145864071/2cb81d33-1e90-45ba-a43e-ba113a7a5544)

Però aci no es mostren els missatges (Tot i que el programa funciona bé aparentment)

![imagen](https://github.com/alejandrorubio29/App-WhatsDAM.-Sprint-2/assets/145864071/e8fb6963-ed44-42ab-942b-c9849520c654)

Revisant el codi, no hem avisat a l’adaptador de la addició del missatge:

![imagen](https://github.com/alejandrorubio29/App-WhatsDAM.-Sprint-2/assets/145864071/c27fb98b-ff64-4774-9688-6f77891d5259)

Finalment, el problema es que el layout_height del RecyclerView era de 0dp. Si el cambiem:

 ![imagen](https://github.com/alejandrorubio29/App-WhatsDAM.-Sprint-2/assets/145864071/27de2231-2e75-42de-8ec9-5230a9615fed)

Ara si mostra correctament els missatges:
![imagen](https://github.com/alejandrorubio29/App-WhatsDAM.-Sprint-2/assets/145864071/dc3e9a96-7e03-4663-9e38-10ab02b5fc04)

Implementem el scroll amb un índex (Ultim missatge)

![imagen](https://github.com/alejandrorubio29/App-WhatsDAM.-Sprint-2/assets/145864071/9a3ed540-4186-4793-adc9-f56a4b42a24d)


