# Obligatorisk oppgave 1 i Algoritmer og Datastrukturer

Denne oppgaven er en innlevering i Algoritmer og Datastrukturer. 
Oppgaven er levert av følgende studenter:
* Majda Ivic, S362095, s362095@oslomet.no
* ...

# Arbeidsfordeling

Leverer oppgaven alene

# Oppgavebeskrivelse

Jeg glemte å commite på hver oppgave underveis, beklager dette. Jeg skal gjøre det i neste oblig


Oppgave 1

Oppgave 1 består av to metoder.
Maks() metoden finner den største tallet og setter den på slutten av arraye. 
Underveis sorterer den arraye. Til slutt returnerer metoden siste tall i array, det vil si, 
den største talle som er plasser sist i arrayet. Metoden også kaster ut  NoSuchElementException hvis 
tabellen er tomt med en passende tekst slik oppgaven ber om.

Den andre metoden ombyttinger() bruker samme kode som maks(), burtsett av jeg teller antall obytninger 
i arraye.

Svar på teoretisk delen. 

1. Når blir det flest ombyttinger?
Flest ombytning har vi når støste tall står på føste plass, når tal er sortert i 
minkende rekkefølge dvs. n-1 ombyttninger.

2. Når blir det færrest?
Minst ombyttning har vi når tall er sortert i stigende rekkefølge da har vi flest ombyttninger

3. Hvor mange blir det i gjennomsnitt?
Vi har situasjon der antall obyttningener kan variere fra  tabell til tabell. Det betyr at gjennomsnitt av 
dem større enn det største av tallene foran. Formelen for å finne ut av det er : Hn − 1 ≈ log(n) – 0,423 
(dette er også snakk om naturlige logaritmer!)


Vi kan konkludere at public static int ombyttinger(int[]a) metoden er dårligere en public static int maks(int[] a) 
som vi har lært tideligere

Oppgave 2

Metoden som retunerer antall forskellige verdier i a.
Koden innenbarer to while løkker som looper gjennom arrayet.

1. starter med å plukke en verdien om gangen (while løkke med i)
2. While løkke med j start altid fra første index (venstre) av 
løkka og looper mot høyre helt til indexsen i.
3. Så lenger verdier a[i] og a[j] er ulike skal j++ øke
4. Hvis verdiene er like hopper vi ut av løkka og går til index sjekking som beskrevet i 5.
5. Hvis i == j indexsene er like kan vi øke antallLike.

For å sjekke om abellen er sortert har jeg lånet en hhelpe metode fra kompendiet 
public static boolean erSortert(int[] a), og hvis a ikke er
sortert stigende, skal det kastes en IllegalStateException (med en passende tekst).

Metoden også returnerer 0 hvis arrayet er tomt slik oppgaven ber om

Oppgave 3

Metoden går ut på å finne like verdier. Når vi vet antall like 
verdier kan vi bare :   a.length - likeTall

Oppgave 4

Målet er å finne den mest effektive koden. For å oppnå dette har jeg brukt en del 
metoder fra kompendiet. Akkurat hvor kden kommer fra er grundig beskrevet i oppgave 4 i Oblig1.java,
Sammen med detalijertebeskrivelse av hva de hjepe metodene gjør. 

1. Metoden delsortering(int[] a) bruker kvikk sortering fra kompendie for å sortere tabellen
2. Når tabellen er sortert ved help avkvikksortering(a), oppretes en variabel oddetall som skal hjelpe til skille odde 
tallene fra par tallene, og den skal videre brukes til å navigere hvor odde tallene slutter.
3. Odde tallene bare forsives en enhet bak over og overtar plass til sin parr tal fra høyre, mens par tallene 
bare overføres på høyre side.
4. Vi ender opp med en tabell som er sorter på venste siden (oddetall) og en høyre side med usortet del
5. metoden kvikksortering(a, oddetall, a.length) kalles denne gangen fordi vi er intresert i å sortere bare partallne
variabel oddetall brukes for å navigere hvor oddetallene slutter


Oppgave 5

1. variabel char sist lagrer den siste elemente
2. while løkke starter å telle bakerst, og hver indexs trekkes 1. 
Dette gjør at vi kan flytte en enhet måt høyre
3. Første index peker måt siste som ble tatt være på i char sist variabel


Oppgave 7

a)
1.i = 0 med dette velger vi hvilket bokstaver skal velges først fra setningene i vår ny setning
2.Oppgaven går ut på å finne lengde på settninger(antal bokstaver) og while løkke kjører
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
''| | | | | | |     dette fortsetter helt til vi er ferdig
R|T|R|T|E| | |      Dette er en liten feil obligen når det gjeleder ord fordelig av ord og settning, 
I|O| | | | | |      men tenegangen er sånn som beskrevet
T|G|A|U|U| | |




I 