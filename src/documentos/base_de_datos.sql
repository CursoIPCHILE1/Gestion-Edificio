--
-- PostgreSQL database dump
--

-- Dumped from database version 9.1.12
-- Dumped by pg_dump version 9.3.1
-- Started on 2014-10-15 08:56:20

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- TOC entry 1912 (class 1262 OID 33110)
-- Name: gestion-edificio; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE "gestion-edificio" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'es_CL.UTF-8' LC_CTYPE = 'es_CL.UTF-8';


ALTER DATABASE "gestion-edificio" OWNER TO postgres;

\connect "gestion-edificio"

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- TOC entry 169 (class 3079 OID 11647)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 1915 (class 0 OID 0)
-- Dependencies: 169
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

--
-- TOC entry 186 (class 1255 OID 41469)
-- Name: pa_esteban_delete(integer, character varying, character varying, integer, character varying, character varying, character varying, integer, integer); Type: FUNCTION; Schema: public; Owner: esteban
--

CREATE FUNCTION pa_esteban_delete(ucod integer, unombre character varying, udireccion character varying, ufono integer, ucargo character varying, utipo_usuario character varying, urut character varying, upasword integer, uhorario integer) RETURNS text
    LANGUAGE plpgsql
    AS $$
DECLARE 
ins text;

BEGIN 
delete from usuario where cod=ucod;
ins ='Se han borrado los datos';


return ins;
END
$$;


ALTER FUNCTION public.pa_esteban_delete(ucod integer, unombre character varying, udireccion character varying, ufono integer, ucargo character varying, utipo_usuario character varying, urut character varying, upasword integer, uhorario integer) OWNER TO esteban;

--
-- TOC entry 183 (class 1255 OID 41465)
-- Name: pa_esteban_insert(integer, character varying, character varying, integer, character varying, character varying, character varying, integer, integer); Type: FUNCTION; Schema: public; Owner: esteban
--

CREATE FUNCTION pa_esteban_insert(ucod integer, unombre character varying, udireccion character varying, ufono integer, ucargo character varying, utipo_usuario character varying, urut character varying, upasword integer, uhorario integer) RETURNS text
    LANGUAGE plpgsql
    AS $$
DECLARE 
ins text;

BEGIN 
insert into Usuario(cod, nombre, direccion, fono, cargo, tipo_usuario,rut, pasword, horario  ) values
(ucod, unombre, udireccion, ufono, ucargo, utipo_usuario, urut, upasword, uhorario );
ins ='Se han insertado datos';


return ins;
END
$$;


ALTER FUNCTION public.pa_esteban_insert(ucod integer, unombre character varying, udireccion character varying, ufono integer, ucargo character varying, utipo_usuario character varying, urut character varying, upasword integer, uhorario integer) OWNER TO esteban;

--
-- TOC entry 185 (class 1255 OID 41466)
-- Name: pa_esteban_update(integer, character varying, character varying, integer, character varying, character varying, character varying, integer, integer); Type: FUNCTION; Schema: public; Owner: esteban
--

CREATE FUNCTION pa_esteban_update(ucod integer, unombre character varying, udireccion character varying, ufono integer, ucargo character varying, utipo_usuario character varying, urut character varying, upasword integer, uhorario integer) RETURNS text
    LANGUAGE plpgsql
    AS $$
DECLARE 
ins text;

BEGIN 
update Usuario set nombre=unombre, direccion=udireccion, fono=ufono, cargo=ucargo, tipo_usuario=utipo_usuario, rut=urut, pasword=upasword, horario=uhorario   WHERE
cod=ucod;
ins ='Se han actualizado los datos';


return ins;
END
$$;


ALTER FUNCTION public.pa_esteban_update(ucod integer, unombre character varying, udireccion character varying, ufono integer, ucargo character varying, utipo_usuario character varying, urut character varying, upasword integer, uhorario integer) OWNER TO esteban;

--
-- TOC entry 188 (class 1255 OID 41474)
-- Name: pa_felipe_gasto(integer, date, integer, integer, integer, integer, integer, integer, integer); Type: FUNCTION; Schema: public; Owner: felipe
--

CREATE FUNCTION pa_felipe_gasto(cod_gast integer, fecha date, sueldo integer, agua integer, gas integer, luz integer, aseo integer, cod_ed integer, contingencia integer) RETURNS void
    LANGUAGE plpgsql
    AS $$

BEGIN 

case tipo
when 1 then
insert into pa_felipe_gasto (cod_gast, fecha, sueldo, agua, gas, luz, aseo,
cod_ed, contingencia) values(ccod_gast, cfecha, csueldo, cagua, cgas, cluz, caseo,
ccod_ed, ccontingencia);

when 2 then
update pa_felipe_gasto set cod_gast=ccod_gast WHERE
cod_ed=ccod_ed;


when 3 then
delete from pa_felipe_gasto where cod_ed=ccod_ed;
end case;
END
$$;


ALTER FUNCTION public.pa_felipe_gasto(cod_gast integer, fecha date, sueldo integer, agua integer, gas integer, luz integer, aseo integer, cod_ed integer, contingencia integer) OWNER TO felipe;

--
-- TOC entry 184 (class 1255 OID 41467)
-- Name: pa_felipe_pago(integer, date, integer, integer, integer, integer, integer, integer, integer); Type: FUNCTION; Schema: public; Owner: felipe
--

CREATE FUNCTION pa_felipe_pago(cod_gast integer, fecha date, sueldo integer, agua integer, gas integer, luz integer, aseo integer, cod_ed integer, contingencia integer) RETURNS void
    LANGUAGE plpgsql
    AS $$

BEGIN 

case tipo
when 1 then
insert into pa_felipe_pago (cod_gast, fecha, sueldo, agua, gas, luz, aseo,
cod_ed, contingencia) values(ccod_gast, cfecha, csueldo, cagua, cgas, cluz, caseo,
ccod_ed, ccontingencia);

when 2 then
update pa_felipe_pago set cod_gast=ccod_gast WHERE
cod_ed=ccod_ed;


when 3 then
delete from pa_felipe_pago where cod_ed=ccod_ed;
end case;
END
$$;


ALTER FUNCTION public.pa_felipe_pago(cod_gast integer, fecha date, sueldo integer, agua integer, gas integer, luz integer, aseo integer, cod_ed integer, contingencia integer) OWNER TO felipe;

--
-- TOC entry 182 (class 1255 OID 41454)
-- Name: pa_gonzaloactualizar(integer, integer, integer, integer); Type: FUNCTION; Schema: public; Owner: gonzalo
--

CREATE FUNCTION pa_gonzaloactualizar(cid_dpto integer, ccodlab integer, ccedi integer, cn_dpto integer) RETURNS void
    LANGUAGE plpgsql
    AS $$ BEGIN Update departamento set n_dpto=cn_dpto WHERE id_dpto=cid_dpto; END $$;


ALTER FUNCTION public.pa_gonzaloactualizar(cid_dpto integer, ccodlab integer, ccedi integer, cn_dpto integer) OWNER TO gonzalo;

--
-- TOC entry 187 (class 1255 OID 41473)
-- Name: pa_gonzaloelimin(integer, integer, integer, integer); Type: FUNCTION; Schema: public; Owner: gonzalo
--

CREATE FUNCTION pa_gonzaloelimin(cid_dpto integer, ccodlab integer, ccedi integer, cn_dpto integer) RETURNS void
    LANGUAGE plpgsql
    AS $$ BEGIN delete From departamento WHERE id_dpto=cid_dpto; END $$;


ALTER FUNCTION public.pa_gonzaloelimin(cid_dpto integer, ccodlab integer, ccedi integer, cn_dpto integer) OWNER TO gonzalo;

--
-- TOC entry 181 (class 1255 OID 41445)
-- Name: pa_gonzaloinsert(integer, integer, integer, integer); Type: FUNCTION; Schema: public; Owner: gonzalo
--

CREATE FUNCTION pa_gonzaloinsert(cid_dpto integer, ccodlab integer, ccedi integer, cn_dpto integer) RETURNS void
    LANGUAGE plpgsql
    AS $$ BEGIN Insert into departamento(id_dpto, codlav, codedi, n_dpto) values (cid_dpto, ccodlab, ccedi, cn_dpto); END $$;


ALTER FUNCTION public.pa_gonzaloinsert(cid_dpto integer, ccodlab integer, ccedi integer, cn_dpto integer) OWNER TO gonzalo;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 162 (class 1259 OID 33138)
-- Name: departamento; Type: TABLE; Schema: public; Owner: gonzalo; Tablespace: 
--

CREATE TABLE departamento (
    id_dpto integer NOT NULL,
    codlav integer NOT NULL,
    codedi integer NOT NULL,
    n_dpto integer NOT NULL,
    dueno numeric(30,0)
);


ALTER TABLE public.departamento OWNER TO gonzalo;

--
-- TOC entry 164 (class 1259 OID 33148)
-- Name: edificio; Type: TABLE; Schema: public; Owner: arturo; Tablespace: 
--

CREATE TABLE edificio (
    cod_ed integer NOT NULL,
    nombre character varying(30),
    direccion character varying(30),
    telefono integer,
    sector character varying(30),
    cod_gast integer
);


ALTER TABLE public.edificio OWNER TO arturo;

--
-- TOC entry 161 (class 1259 OID 33122)
-- Name: gasto; Type: TABLE; Schema: public; Owner: luis; Tablespace: 
--

CREATE TABLE gasto (
    cod_gast integer NOT NULL,
    fecha date,
    sueldo integer,
    agua integer,
    gas integer,
    luz integer,
    aseo integer,
    cod_ed integer,
    contingencia integer
);


ALTER TABLE public.gasto OWNER TO luis;

--
-- TOC entry 163 (class 1259 OID 33143)
-- Name: lavanderia; Type: TABLE; Schema: public; Owner: cris; Tablespace: 
--

CREATE TABLE lavanderia (
    codlavanderia integer NOT NULL,
    fecha date,
    pago integer,
    coddepto integer
);


ALTER TABLE public.lavanderia OWNER TO cris;

--
-- TOC entry 165 (class 1259 OID 33153)
-- Name: pago; Type: TABLE; Schema: public; Owner: michelle; Tablespace: 
--

CREATE TABLE pago (
    fecha_pago date,
    cod_depto integer,
    alerta_moroso character varying(30),
    monto integer,
    "codPago" integer NOT NULL
);


ALTER TABLE public.pago OWNER TO michelle;

--
-- TOC entry 168 (class 1259 OID 41192)
-- Name: pago_codPago_seq; Type: SEQUENCE; Schema: public; Owner: michelle
--

CREATE SEQUENCE "pago_codPago_seq"
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public."pago_codPago_seq" OWNER TO michelle;

--
-- TOC entry 1921 (class 0 OID 0)
-- Dependencies: 168
-- Name: pago_codPago_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: michelle
--

ALTER SEQUENCE "pago_codPago_seq" OWNED BY pago."codPago";


--
-- TOC entry 167 (class 1259 OID 41058)
-- Name: tipousuario; Type: TABLE; Schema: public; Owner: felipe; Tablespace: 
--

CREATE TABLE tipousuario (
    codtipousuario integer NOT NULL,
    descripcion character varying(30),
    horario character varying(30),
    sueldo numeric
);


ALTER TABLE public.tipousuario OWNER TO felipe;

--
-- TOC entry 166 (class 1259 OID 41053)
-- Name: usuario; Type: TABLE; Schema: public; Owner: felipe; Tablespace: 
--

CREATE TABLE usuario (
    codusuario integer NOT NULL,
    nombre character varying(30),
    apellido character varying(30),
    rut integer,
    coded integer,
    codtipousuario integer,
    password integer
);


ALTER TABLE public.usuario OWNER TO felipe;

--
-- TOC entry 1786 (class 2604 OID 41194)
-- Name: codPago; Type: DEFAULT; Schema: public; Owner: michelle
--

ALTER TABLE ONLY pago ALTER COLUMN "codPago" SET DEFAULT nextval('"pago_codPago_seq"'::regclass);


--
-- TOC entry 1901 (class 0 OID 33138)
-- Dependencies: 162
-- Data for Name: departamento; Type: TABLE DATA; Schema: public; Owner: gonzalo
--

INSERT INTO departamento VALUES (2, 2, 2, 2, NULL);
INSERT INTO departamento VALUES (3, 3, 3, 3, NULL);
INSERT INTO departamento VALUES (4, 4, 4, 4, NULL);
INSERT INTO departamento VALUES (5, 5, 5, 5, NULL);
INSERT INTO departamento VALUES (10, 102, 303, 202, NULL);
INSERT INTO departamento VALUES (11, 23, 203, 206, NULL);
INSERT INTO departamento VALUES (8, 1, 1, 101, NULL);
INSERT INTO departamento VALUES (9, 1, 1, 102, NULL);
INSERT INTO departamento VALUES (1, 1, 1, 103, NULL);


--
-- TOC entry 1903 (class 0 OID 33148)
-- Dependencies: 164
-- Data for Name: edificio; Type: TABLE DATA; Schema: public; Owner: arturo
--

INSERT INTO edificio VALUES (1, 'santa_margarita', 'orientales_2243', 12345678, 'oriente', 1);
INSERT INTO edificio VALUES (2, 'santo herman', 'la dehesa', 8573732, 'oriente', 2);
INSERT INTO edificio VALUES (3, 'caca o lizana', 'la pincoya', 7362345, 'poniente', 3);
INSERT INTO edificio VALUES (4, 'sol de america', 'la pinocha', 7432678, 'poniente', 4);
INSERT INTO edificio VALUES (5, 'aloalo', 'la escondida', 74345478, 'poniente', 5);


--
-- TOC entry 1900 (class 0 OID 33122)
-- Dependencies: 161
-- Data for Name: gasto; Type: TABLE DATA; Schema: public; Owner: luis
--

INSERT INTO gasto VALUES (1, '2014-02-02', 500, 200, 5, 33, 31, 1, 500);
INSERT INTO gasto VALUES (2, '2014-02-02', 500, 200, 5, 33, 31, 1, 500);
INSERT INTO gasto VALUES (3, '2014-05-06', 250000, 10000, 20000, 15000, 20000, 1, 0);
INSERT INTO gasto VALUES (4, '2014-06-07', 300000, 10000, 20000, 15000, 20000, 2, 0);
INSERT INTO gasto VALUES (5, '2014-06-22', 400000, 10000, 20000, 15000, 20000, 1, 0);


--
-- TOC entry 1902 (class 0 OID 33143)
-- Dependencies: 163
-- Data for Name: lavanderia; Type: TABLE DATA; Schema: public; Owner: cris
--

INSERT INTO lavanderia VALUES (1, '2014-10-08', 2000, 1);
INSERT INTO lavanderia VALUES (2, '2014-10-08', 5000, 2);
INSERT INTO lavanderia VALUES (3, '2014-10-08', 40000, 9);


--
-- TOC entry 1904 (class 0 OID 33153)
-- Dependencies: 165
-- Data for Name: pago; Type: TABLE DATA; Schema: public; Owner: michelle
--

INSERT INTO pago VALUES ('2014-09-24', 1, 'si', NULL, 1);
INSERT INTO pago VALUES ('2014-09-14', 2, 'no', NULL, 2);
INSERT INTO pago VALUES ('2014-09-19', 3, 'no', NULL, 3);
INSERT INTO pago VALUES ('2014-09-09', 4, 'no', NULL, 4);
INSERT INTO pago VALUES ('2014-09-29', 5, 'si', NULL, 5);
INSERT INTO pago VALUES ('2014-10-02', 203, 'si', 30000, 6);
INSERT INTO pago VALUES ('2014-11-10', 202, 'si', 20000, 7);
INSERT INTO pago VALUES ('2014-10-10', 122, 'si', 20202, 8);
INSERT INTO pago VALUES ('2014-11-10', 202, 'si', 10000, 9);
INSERT INTO pago VALUES ('2014-10-08', 208, 'si', 50000, 10);
INSERT INTO pago VALUES ('2014-10-08', 208, 'si', 50000, 11);
INSERT INTO pago VALUES ('2014-01-01', 209, 'si', 752, 12);
INSERT INTO pago VALUES ('2014-05-04', 209, 'si', 50000, 13);


--
-- TOC entry 1922 (class 0 OID 0)
-- Dependencies: 168
-- Name: pago_codPago_seq; Type: SEQUENCE SET; Schema: public; Owner: michelle
--

SELECT pg_catalog.setval('"pago_codPago_seq"', 13, true);


--
-- TOC entry 1906 (class 0 OID 41058)
-- Dependencies: 167
-- Data for Name: tipousuario; Type: TABLE DATA; Schema: public; Owner: felipe
--

INSERT INTO tipousuario VALUES (11, 'estudiante_concerje', 'sabado_domingo', NULL);
INSERT INTO tipousuario VALUES (12, 'conseje_principal', 'lunes_viernes', NULL);
INSERT INTO tipousuario VALUES (13, 'conserje_asistente', 'lunes_viernes', NULL);


--
-- TOC entry 1905 (class 0 OID 41053)
-- Dependencies: 166
-- Data for Name: usuario; Type: TABLE DATA; Schema: public; Owner: felipe
--

INSERT INTO usuario VALUES (1, 'rodrigo', 'ulloa', 174445553, 111, 11, 2121);
INSERT INTO usuario VALUES (2, 'lorena', 'rodriguez', 186669994, 222, 22, 2222);
INSERT INTO usuario VALUES (3, 'alan', 'brito', 178883336, 333, 33, 3131);
INSERT INTO usuario VALUES (4, 'paris', 'reyes', 161112223, 444, 44, 4141);
INSERT INTO usuario VALUES (5, 'camilo', 'castillo', 198887776, 555, 55, 5151);


--
-- TOC entry 1790 (class 2606 OID 33142)
-- Name: depto_key; Type: CONSTRAINT; Schema: public; Owner: gonzalo; Tablespace: 
--

ALTER TABLE ONLY departamento
    ADD CONSTRAINT depto_key PRIMARY KEY (id_dpto);


--
-- TOC entry 1794 (class 2606 OID 33152)
-- Name: edificio_pkey; Type: CONSTRAINT; Schema: public; Owner: arturo; Tablespace: 
--

ALTER TABLE ONLY edificio
    ADD CONSTRAINT edificio_pkey PRIMARY KEY (cod_ed);


--
-- TOC entry 1788 (class 2606 OID 33126)
-- Name: gasto_pkey; Type: CONSTRAINT; Schema: public; Owner: luis; Tablespace: 
--

ALTER TABLE ONLY gasto
    ADD CONSTRAINT gasto_pkey PRIMARY KEY (cod_gast);


--
-- TOC entry 1792 (class 2606 OID 33147)
-- Name: lavanderia_pkey; Type: CONSTRAINT; Schema: public; Owner: cris; Tablespace: 
--

ALTER TABLE ONLY lavanderia
    ADD CONSTRAINT lavanderia_pkey PRIMARY KEY (codlavanderia);


--
-- TOC entry 1798 (class 2606 OID 41062)
-- Name: tipousuario_pkey; Type: CONSTRAINT; Schema: public; Owner: felipe; Tablespace: 
--

ALTER TABLE ONLY tipousuario
    ADD CONSTRAINT tipousuario_pkey PRIMARY KEY (codtipousuario);


--
-- TOC entry 1796 (class 2606 OID 41057)
-- Name: usuario_pkey; Type: CONSTRAINT; Schema: public; Owner: felipe; Tablespace: 
--

ALTER TABLE ONLY usuario
    ADD CONSTRAINT usuario_pkey PRIMARY KEY (codusuario);


--
-- TOC entry 1914 (class 0 OID 0)
-- Dependencies: 5
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


--
-- TOC entry 1916 (class 0 OID 0)
-- Dependencies: 162
-- Name: departamento; Type: ACL; Schema: public; Owner: gonzalo
--

REVOKE ALL ON TABLE departamento FROM PUBLIC;
REVOKE ALL ON TABLE departamento FROM gonzalo;
GRANT ALL ON TABLE departamento TO gonzalo;
GRANT ALL ON TABLE departamento TO PUBLIC;


--
-- TOC entry 1917 (class 0 OID 0)
-- Dependencies: 164
-- Name: edificio; Type: ACL; Schema: public; Owner: arturo
--

REVOKE ALL ON TABLE edificio FROM PUBLIC;
REVOKE ALL ON TABLE edificio FROM arturo;
GRANT ALL ON TABLE edificio TO arturo;
GRANT ALL ON TABLE edificio TO PUBLIC;


--
-- TOC entry 1918 (class 0 OID 0)
-- Dependencies: 161
-- Name: gasto; Type: ACL; Schema: public; Owner: luis
--

REVOKE ALL ON TABLE gasto FROM PUBLIC;
REVOKE ALL ON TABLE gasto FROM luis;
GRANT ALL ON TABLE gasto TO luis;
GRANT ALL ON TABLE gasto TO PUBLIC;


--
-- TOC entry 1919 (class 0 OID 0)
-- Dependencies: 163
-- Name: lavanderia; Type: ACL; Schema: public; Owner: cris
--

REVOKE ALL ON TABLE lavanderia FROM PUBLIC;
REVOKE ALL ON TABLE lavanderia FROM cris;
GRANT ALL ON TABLE lavanderia TO cris;
GRANT ALL ON TABLE lavanderia TO PUBLIC;


--
-- TOC entry 1920 (class 0 OID 0)
-- Dependencies: 165
-- Name: pago; Type: ACL; Schema: public; Owner: michelle
--

REVOKE ALL ON TABLE pago FROM PUBLIC;
REVOKE ALL ON TABLE pago FROM michelle;
GRANT ALL ON TABLE pago TO michelle;
GRANT ALL ON TABLE pago TO PUBLIC;


-- Completed on 2014-10-15 08:56:23

--
-- PostgreSQL database dump complete
--

