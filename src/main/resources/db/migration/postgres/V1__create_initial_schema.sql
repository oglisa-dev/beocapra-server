

create table public.adresa_dobavljaca (
                                          dobavljacid  bigserial not null,
                                          adresa_dobavljacaid int8 not null,
                                          broj int4,
                                          broj_telefona varchar(255),
                                          fax varchar(255),
                                          gradid int8,
                                          tip_objektaid int8,
                                          ulica varchar(255),
                                          primary key (dobavljacid, adresa_dobavljacaid)
)


create table public.dobavljac (
                                  dobavljacid  bigserial not null,
                                  email varchar(255),
                                  maticni_broj varchar(255),
                                  naziv_dobavljaca varchar(255),
                                  pib varchar(255),
                                  website varchar(255),
                                  ziro_racun varchar(255),
                                  primary key (dobavljacid)
)


create table public.fizicka_osobina (
                                        proizvodid  bigserial not null,
                                        fizicka_osobinaid int8 not null,
                                        metod_ispitivanja_fizicke_osobine varchar(255),
                                        naziv_fizicke_osobine varchar(255),
                                        vrednost_fizicke_osobine numeric(19, 2),
                                        proizvod_proizvodid int8 not null,
                                        primary key (proizvodid, fizicka_osobinaid)
)


create table public.grad (
                             gradid  bigserial not null,
                             naziv_grada varchar(255),
                             primary key (gradid)
)


create table public.hemijska_osobina (
                                         proizvodid  bigserial not null,
                                         hemijska_osobinaid int8 not null,
                                         količina numeric(19, 2),
                                         merna_jedinica varchar(255),
                                         sastojci varchar(255),
                                         proizvod_proizvodid int8 not null,
                                         primary key (proizvodid, hemijska_osobinaid)
)


create table public.jedinica_mere (
                                      jedinica_mereid  bigserial not null,
                                      naziv_jedinice_mere varchar(255),
                                      primary key (jedinica_mereid)
)


create table public.odeljenje (
                                  odeljenjeid  bigserial not null,
                                  naziv_odeljenja varchar(255),
                                  primary key (odeljenjeid)
)


create table public.otpremnica_dobavljaca (
                                              otpremnica_dobavljacaid  bigserial not null,
                                              broj_licne_karte varchar(255),
                                              datum_otpremanja date,
                                              dobavljacid int8,
                                              ime_prezime_vozaca varchar(255),
                                              izdao varchar(255),
                                              radnikid int8,
                                              registarski_broj_vozila varchar(255),
                                              primary key (otpremnica_dobavljacaid)
)


create table public.pakovanje (
                                  pakovanjeid  bigserial not null,
                                  naziv_pakovanja varchar(255),
                                  primary key (pakovanjeid)
)


create table public.prijemnica_dobavljaca (
                                              prijemnica_dobavljacaid  bigserial not null,
                                              datum_prijema date,
                                              napomena varchar(255),
                                              dobavljacid int8 not null,
                                              radnikid int8 not null,
                                              primary key (prijemnica_dobavljacaid)
)


create table public.proizvod (
                                 proizvodid  bigserial not null,
                                 cena numeric(19, 2) not null,
                                 datum_proizvodnje date not null,
                                 naziv_proizvoda varchar(255) not null,
                                 trenutno_stanje_zaliha numeric(19, 2) not null,
                                 vrsta_proizvoda varchar(255) not null,
                                 jedinica_mereid int8,
                                 tip_proizvodaid int8,
                                 primary key (proizvodid)
)


create table public.radnik (
                               radnikid  bigserial not null,
                               broj_radne_knjizice varchar(255),
                               ime_prezime varchar(255),
                               jmbg varchar(255),
                               password varchar(255),
                               radno_mestoid int8,
                               username varchar(255),
                               primary key (radnikid)
)


create table public.radno_mesto (
                                    radno_mestoid  bigserial not null,
                                    naziv_radnog_mesta varchar(255),
                                    odeljenjeid int8,
                                    opis_radnog_mesta varchar(255),
                                    primary key (radno_mestoid)
)


create table public.se_pakuje (
                                  proizvodid  bigserial not null,
                                  pakovanjeid int8 not null,
                                  kolicina numeric(19, 2),
                                  primary key (proizvodid, pakovanjeid)
)


create table public.stavka_otpremice_dobavljaca (
                                                    stavka_otpremnice_dobavljacaid  bigserial not null,
                                                    otpremnica_dobavljacaid int8 not null,
                                                    količina numeric(19, 2),
                                                    proizvodid int8,
                                                    primary key (stavka_otpremnice_dobavljacaid, otpremnica_dobavljacaid)
)


create table public.stavka_prijemnice_dobavljaca (
                                                     stavka_prijemnice_dobavljacaid int8 not null,
                                                     prijemnica_dobavljacaid int8 not null,
                                                     kolicina numeric(19, 2),
                                                     proizvodid int8,
                                                     vrednost numeric(19, 2),
                                                     primary key (stavka_prijemnice_dobavljacaid, prijemnica_dobavljacaid)
)


create table public.tip_objekta (
                                    tip_objektaid  bigserial not null,
                                    naziv_tipa_objekta varchar(255),
                                    opis_tipa_objekta varchar(255),
                                    primary key (tip_objektaid)
)


create table public.tip_proizvoda (
                                      tip_proizvodaid  bigserial not null,
                                      naziv_tipa_proizvoda varchar(255),
                                      primary key (tip_proizvodaid)
)


create table public.tovarni_list (
                                     tovarni_listid  bigserial not null,
                                     datum_slanja date,
                                     napomena varchar(255),
                                     primary key (tovarni_listid)
)
create sequence hibernate_sequence start 1 increment 1


create table radnik_roles (
                              radnik_entity_radnikid int8 not null,
                              roles_id int8 not null
)


create table role (
                      id int8 not null,
                      name varchar(255),
                      primary key (id)
)


alter table public.fizicka_osobina
    add constraint FKnieg1mdvqr9r6jtk55l06yb99
        foreign key (proizvod_proizvodid)
            references public.proizvod


alter table public.hemijska_osobina
    add constraint FK9wb4lp9gnyqn05t967asvoe44
        foreign key (proizvod_proizvodid)
            references public.proizvod


alter table public.prijemnica_dobavljaca
    add constraint FK6w9i70x8coy8bu501ro993sdf
        foreign key (dobavljacid)
            references public.dobavljac


alter table public.prijemnica_dobavljaca
    add constraint FK9nacinx28f783uu6qc85uu5ft
        foreign key (radnikid)
            references public.radnik


alter table public.proizvod
    add constraint FK53frbcxw3nuik2jl3dqxf7rm
        foreign key (jedinica_mereid)
            references public.jedinica_mere


alter table public.proizvod
    add constraint FKihwgayr67qlx02tsa6ekslo2x
        foreign key (tip_proizvodaid)
            references public.tip_proizvoda


alter table public.stavka_prijemnice_dobavljaca
    add constraint FK5xtk6p8mwxkxn345laelb693
        foreign key (prijemnica_dobavljacaid)
            references public.prijemnica_dobavljaca


alter table radnik_roles
    add constraint FKncwrqqw3gqjx4mp2uvux3lw3q
        foreign key (roles_id)
            references role


alter table radnik_roles
    add constraint FKcsass4vfjk6w64afnqt7yu8se
        foreign key (radnik_entity_radnikid)
            references public.radnik