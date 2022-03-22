show databases;
use  Veterinaria;
create table persona(
 Ci int,
Nombre varchar(45),
Direccion varchar(45),
primary key(Ci)
);
create table persona_telefono( 
Ci int,
Telefono int,
primary key(ci),
foreign key(ci) references persona(Ci)
);
create table mascotas( 
Id int,
ciP int,
nombre varchar(45),
anoNacimineto date,
primary key(id),
foreign key(ciP) references persona(Ci)
);

insert into persona values( 54471580, 'Veronica Morgades', 'burdeos y la via');
insert into persona_telefono values(54471580, 098761548);
insert into persona values (16549853, 'Martin Perez', '18 de julio');
insert into persona_telefono values(16549853, 098654123);

 insert into mascotas values(01, 54471580,'perro', '20/03/22');
 insert into mascotas values(02, 16549853 ,'gato', '09/060/19');
 
 
alter table persona change nombre nombreyapellido varchar(45);
alter table persona change ci cedulaPersona int;
alter table persona drop column Direccion;
create table persona_direccion( numPuerta int, 
								calle varchar(45),
								ciudad varchar(45),
                                primary key(numPuerta, calle, Ciudad)
                                );

alter table mascotas add raza varchar(45);
alter table mascotas add fechaUltimaVacuna date;
alter table mascotas add colorPelo varchar(45);
alter table mascotas add detallesEnfermedad varchar(100);
alter table mascotas add tuvoCria boolean;

alter table mascotas drop column colorPelo;
alter table mascotas drop column detallesEnfermedad;
alter table mascotas drop column tuvoCria;


 alter table mascotas drop foreign key mascotas_ibfk_1;
 alter table persona_telefono drop foreign key persona_telefono_ibfk_1;
 alter table persona drop primary key;
 alter table persona add primary key(pasaporte);
 

                       
                        