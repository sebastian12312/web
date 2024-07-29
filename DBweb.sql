create database web
create table usuario(
id_usuario char(15) primary key,
id_documento int,
numero_documento varchar(20) unique,
email varchar(100) unique,
username varchar(100) unique,
contrasena varchar(100),
id_estado int
)

create table perfil(
id_usuario char(15),
nombre varchar(100),
primer_apellido  varchar(100),
segundo_apellido varchar(100),
saldo float,
pais varchar(50),
telefono varchar(20),
fecha_nacimiento date,
perfil_img varchar(5000),
id_genero int,
id_role int
)

