Zadatak 1

￼Napraviti klasu Computer, koja je abstract. Klasa sadrži ime i MAC adresu računara. Pored toga, napraviti i dva konstruktora, kao i dvije get metode. MAC adresa je objekat koju opisuje unutrašnja nestatična klasa MACAddress. Objekat tog tipa treba sadržavati niz karaktera adrese, ali bez ':'. Klasa treba imati toString metodu i konstruktor. Napraviti i equals i toString metode za Computer klasu.

Zadatak 2

Napisati klasu Network, koja je abstract. Network klasa sadrži atribut imena mreže, kao i spisak računara koji su u toj mreži (niz računara). Klasa sadrži konstruktor koji inicijalizira broj računara niza na 0, kao i metodu addComputer(Computer c)i removeComputer(Computer c),kojesuabstract.

Zadatak 3

Napisati Server klasu koja sadrži broj koji označava koliko maksimalno drugih računara može podnijeti a da ne doživi krah. Napraviti i jednu get metodu za taj limit. Napisati dodatni konstruktor koji inicijalizira ime, MAC adresu i spomenuti limit servera. Napraviti i equals i toString metode.

Zadatak 4

Napraviti interface Connectable koji sadrži metode connect(Computer), connect(Network) i disconnect().
Client klasa sadrži atribut tipa Computer koji označava sa kojim je računarom dati klijent spojen. Pored toga, ima još jedan sličan atribut koji je tipa Network koji označava sa kojom je mrežom klijent spojen. Konstruktor klijenta treba imati samo ime i MAC adresu. Klasa implementira Connectable interface. Metoda connect treba da postavi link na dati računar, odnosno na datu mrežu. Ukoliko link već postoji onda baciti exception. Metoda disconnect postavlja oba linka na null. Napisati i get metodu za te link metode. Napraviti i equals i toString metode.
Napomena: Client se nikada ne može spojiti na drugu mrežu/računar ako mu oba atributa nisu null! Zadatak 5
Napraviti demonstraciju svih klasa i metoda iz prijašnja četiri zadatka.
Napisati javadoc za sve metode (nije potrebno za equals i toString metode).
￼
￼Part 2

￼Zadatak 1

Napraviti interface Functionable koji ima metodu boolean isFunctioning().
Zadatak 2

Napraviti klasu ArrayManipulation koja sadrži static metodu extendArray(Computer[]) koja proširi dati niz za jedan index/element. Novi element treba biti null. Pored toga, tu se nalazi i metoda shrinkArray(Computer[], int) koja smanji dati niz za jedan tako što „obriše“ dati index.

Zadatak 3

Napraviti klasu BusNetwork koja nasljeđuje Network klasu i implementira Functionable interface.
Metoda addComputer radi na principu tako što proširi prvo niz računara za jedan, zatim stavi dati računar na to mjesto i povezuje računar preko njegove connect metode sa ovom mrežom. Metoda removeComputer radi na principu tako što prvo pronađe dati računar (ako ga nema baciti exception) i obriše ga (smanji niz). Pored toga, računar prekida svoju vizu sa mrežom preko svoje disconnect metode.
Metoda isFunctioning treba vratiti true ukoliko ima barem dva računara spojena na mreži (da nisu null). toString metoda treba imati broj računara u sebi, kao i dio koji govori da li mreža funkcioniše ili ne.

Zadatak 4

Napraviti klasu StarNetwork koja nasljeđuje Network klasu i implementira Functionable interface. Klasa sadrži jedan Server.
Metoda addComputer radi na principu tako što proširi prvo niz računara za jedan, zatim stavi računar na to mjesto. Pored toga, dati računar se povezuje preko connect metode sa serverom preko svoje connect metode. Metoda removeComputer radi na principu tako što prvo pronađe dati računar (ako ga nema baciti exception) i obriše ga (smanji niz). Pored toga, dati računar prekida link sa serverom preko svoje disconnect metode.
Metoda isFunctioning treba vratiti true ukoliko server radi. Server pada ukoliko ima više povezanih računara nego što može podnijeti. toString metoda treba imati broj spojenih računara na server u sebi, kao i dio koji govori da li mreža funkcioniše ili ne.

Zadatak 5

Napisati javadoc za sve metode osim toString i equals metode. Napisati demonstraciju svih metoda!