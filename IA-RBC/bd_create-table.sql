CREATE SEQUENCE user_id_seq;
create table caso(
	id smallint not null default nextval('user_id_seq'),
	objetivo  varchar(255) not null,
	area_damaged varchar(255) not null,
	canker_lesion varchar(255) not null,
	crop_hist varchar(255) not null,
	mes varchar(255) not null,
	external_decay varchar(255) not null,
	fruit_spots varchar(255) not null,
	fruiting_bodies varchar(255) not null,
	fruit_pods varchar(255) not null,
	germination varchar(255) not null,
	hail varchar(255) not null,
	int_discolor varchar(255) not null,
	leaf_malf varchar(255) not null,
	leaf_mild varchar(255) not null,
	leafsports_shread  varchar(255) not null,
	leafspots_halo varchar(255) not null,
	leafspots_size  varchar(255) not null,
	leafspots_marg  varchar(255) not null,
	leaves varchar(255) not null,
	lodging varchar(255) not null,
	mold_growth varchar(255) not null,
	mycelium varchar(255) not null,
	plant_growth varchar(255) not null,
	plant_stand varchar(255) not null,
	precip varchar(255) not null,
	roots varchar(255) not null,
	sclerotia varchar(255) not null,
	seed varchar(255) not null,
	seed_discolor varchar(255) not null,
	seed_size varchar(255) not null,
	seed_tmt varchar(255) not null,
	severity varchar(255) not null,
	shriveling varchar(255) not null,
	stem varchar(255) not null,
	stem_cankers varchar(255) not null,
	temperatura varchar(255) not null,
	constraint pk_caso primary key(id)
);
ALTER SEQUENCE user_id_seq OWNED BY caso.id;

create table valor(
	id int not null,
	atributo varchar(255) not null,
	valor varchar(255) not null,
	valor_nome varchar(255) not null,
	similaridade varchar(255) not null,
	constraint pk_valor primary key(id)
);

create table peso(
	id int not null,
	atributo varchar(255) not null,
	valor int not null,
	constraint pk_peso primary key(id)
);

--select setval('user_id_seq',307)