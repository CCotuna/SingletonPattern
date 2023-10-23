# SingletonPattern

Pattern-ul Singleton e o modalitate de a crea un singur obiect care este distribut in aplicatie fara a fi nevoie sa fie recreat(pierzand informatiile din obiect).

E folosit atunci cand se doreste ca un obiect sa fie o singura data instantiat, iar restul referintelor catre acea clasa vor indica aceeasi instanta unica.

Poate fi comparat cu o variabila globala.
E folosit in cazurile in care ai un set redus de informatii care trebuie distribute in aplicatie si nu se doreste a crea mai multe clase care sa salveze informatiile.
Singleton poate fi folosit atunci cand lucram cu conexiuni la baze de date.
Este folosit pentru a nu permite crearea unui obiect decat o singura data. Folosit atunci cand toti clientii trebuie sa foloseasca o singura instanta a unei clase.

Pro:
- nu trebuie sa creezi mai multe obiecte, respectiv clase
- ofera un singur punct de acces la obiect din orice alta parte a aplicatiei

Cons:
- aplicatia devine dependenta de el, ceea ce va ingreuna schimbarea sau refactorizarea obiectului
- comportandu-se ca o variabila globala devine mai greu de urmarit (schimbarile ce se intampla in obiect)

Cazuri speciale: multithreading
