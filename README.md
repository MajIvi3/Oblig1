# Obligatorisk oppgave 1 i Algoritmer og Datastrukturer

Denne oppgaven er en innlevering i Algoritmer og Datastrukturer. 
> Oppgaven er levert av følgende student:
> * Majda Ivic, S362095, s362095@oslomet.no
>
>
> # Oppgavebeskrivelse




## Oppgave 1

Oppgave 1 består av to metoder:

1. Maks()-metoden finner det største tallet og plasserer det på slutten av array. 
Underveis sorterer den arrayet. Til slutt returnerer metoden det siste tallet i array, det vil si 
det største tallet plassert sist i array. Metoden kaster også ut NoSuchElementException hvis 
Tabellen er tom med en passende tekst som forespurt av oppgaven.

2. Den andre metoden switches() bruker samme kode som max(), bortsett fra at jeg teller antall ombytninger  
Jeg arraye.



***Svar på teoretisk delen***

1. Når blir det flest ombyttinger?
Flest ombytning har vi når største tall står på første plass, når tall er sortert i 
minkende rekkefølge dvs. n-1 ombytninger.

2. Når blir det færrest?
Minst ombytning har vi når tall er sortert i stigende rekkefølge da har vi flest ombytninger

3. Hvor mange blir det i gjennomsnitt?
Vi har situasjon der antall ombytningene kan variere fra  tabell til tabell. Det betyr at gjennomsnitt av 
dem større enn det største av tallene foran. Formelen for å finne ut av det er : $H_{n-1} \approx \log(n) - 0.423$
 
(dette er også snakk om naturlige logaritmer!)


Vi kan konkludere at public static int ombyttinger(int[]a) metoden er dårligere en public static int maks(int[] a) 
som vi har lært tidligere

## Oppgave 2

Metoden som returnerer antall forskjellige verdier i a.
Koden innholder to while løkker som looper gjennom arrayet.

1. starter med å plukke en verdi om gangen (while løkke med i)
2. While løkke med j start alltid fra første index (venstre) av 
løkka og looper mot høyre helt til indeksen i.
3. Så lenger verdier a[i] og a[j] er ulike skal j++ øke
4. Hvis verdiene er like hopper vi ut av løkka og går til index sjekking som beskrevet i 5.
5. Hvis i == j indeksene er like kan vi øke antall Like.

For å sjekke om tabellen er sortert har jeg lånet en hjelpe metode fra kompendiet 
public static boolean erSortert(int[] a), og hvis tabellen ikke er
sortert stigende, skal det kastes en IllegalStateException (med en passende tekst).

Metoden returnerer 0 hvis arrayet er tomt slik oppgaven ber om

## Oppgave 3

Metoden går ut på å finne antall like verdier først. Deretter trekker vi antall like verdier fra array slik: return (a.length - equalNumber); og resultatet er antall forskjellige verdier vi er ute etter.


## Oppgave 4

Målet er å finne den mest effektive koden. For å oppnå dette har jeg brukt en del 
metoder fra kompendiet. Akkurat hvor koden kommer fra er grundig beskrevet i oppgave 4 i Oblig1.java klasse


1. Metoden delsortering(int[] a) bruker kvikk sortering fra kompendiet for å sortere tabellen
2. Når tabellen er sortert ved help av kvikksortering(a), opprettes en variabel oddetallsvariabeltall for å skille oddetall fra parrtall,, og det bør videre brukes til å navigere hvor oddetallene slutter.
3.Oddetall forskyver ganske enkelt en enhet bak og tar plass til parnumrene fra høyre, mens par tallene bare overført på høyre side.
4. Vi ender opp med en tabell som er sortert på venstre side (oddetall) og en høyre side med den usorterte delen
5. metoden kvikksortering(a, oddetall, a.length) soretrer sorterer partall delen av array


## Oppgave 5

Denne algoritmen utfører en operasjon som kalles høyre rotasjon. Det tar en array som input, og den roterer alle elementene ett trinn til høyre.



1. Det starter med å lagre det siste elementet i matrisen i en variabel som kalles sist'
2. Ved hjelp av en while-loop flyttes array-elementene ett trinn til høyre ved å starte ved den siste indeksen a[a.length-1] og iterere til den første indeksen (i > 0) i hver iterasjon, det nåværende elementet tilordnes verdien av det forrige elementet, på denne måten blir alle elementene i matrisen forskjøvet ett trinn til høyre.
3. Til slutt tilordnes det første elementet i array verdien av variabelen sist, dette setter det siste elementet som opprinnelig ble lagret til den første posisjonen til matrisen.

<b>Kompleksiteten til denne algoritmen er O(n) </b>


## Oppgave 7

a)
1. i = 0 med dette velger vi hvilket bokstaver skal velges først fra setningene i vår ny setning
2. Oppgaven går ut på å finne lengde på settninger(antal bokstaver) og while løkke kjører
så lenge det er bokstaver i en av de setningene.
3. oppretter en test, der vi krever at vi skal ta ut bokstaver, en av gangen og appende de i vår nye setningen,
het til vi når  slutten av stningen length().
4. etter at vi er ferdig med første omløp øker i++. Det betyr at vi beveger oss mot neste bokstav som står i settningen.
5. Sånn kjører vi helt til vi er topmt for bokstaver, og ny setning returners til slutt.

b)
 Funker omtrent likt som oppgave a) 7, for å være tydelig skal jeg prøve å tenge hva jeg tenker

A|M| | | | | |       Dette er en matrise der iXj der antall rader er maksimum lengde på ordet
L| | | | | | |       og koloner er arrays lengde. 
G|E|D|S| | | |       Sik looper ve gjennom hele arryet plokker opp først bokstav fra hver ord. I første
O|R|A|T|K|R|R|       omløp. Etterpå øker i++ og vi beveger os videre til neste bokstav i alle ordene, og
'| | | | | | |     dette fortsetter helt til vi er ferdig
R|T|R|T|E| | |      Dette er en liten feil obligen når det gjeleder ord fordelig av ord og settning, 
I|O| | | | | |      men tenegangen er sånn som beskrevet
T|G|A|U|U| | |





