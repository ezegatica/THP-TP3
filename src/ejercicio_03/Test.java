package ejercicio_03;

public class Test {

	public static void main(String[] args) {
		// Declaracion de Entidades
		final String DOMICILIO1 = "Av Siemprevida 123";
		final String DOMICILIO2 = "Segurola y Habana 4310";

		final String SEPARADORMINI = "-----------------";
		final String SEPARADOR = SEPARADORMINI + SEPARADORMINI;

		Inmobiliaria i1 = new Inmobiliaria("Josua Propiedades");
		Inmobiliaria i2 = new Inmobiliaria("Victor Real Estate");

		Barrio b1 = new Barrio("Belgrano");
		Barrio b2 = new Barrio("Palermo");
		Barrio b3 = new Barrio("Recoleta");
		Barrio b4 = new Barrio("Caballito");

		Propiedad p1 = new Propiedad(DOMICILIO1, 62127, TIPO_PROPIEDAD.CASA);
		Propiedad p2 = new Propiedad(DOMICILIO2, 101010, TIPO_PROPIEDAD.DEPARTAMENTO);
		Propiedad p3 = new Propiedad("Av Cabildo 122", 91223, TIPO_PROPIEDAD.PH);
		Propiedad p4 = new Propiedad("Honduras 4122", 621232, TIPO_PROPIEDAD.DEPARTAMENTO);
		Propiedad p5 = new Propiedad("Av Libertador 1221", 72112, TIPO_PROPIEDAD.CASA);
		Propiedad p6 = new Propiedad("Freire 932", 21234, TIPO_PROPIEDAD.DEPARTAMENTO);
		Propiedad p7 = new Propiedad("Santa Fe 4122", 51252, TIPO_PROPIEDAD.PH);
		Propiedad p8 = new Propiedad("Av Cordoba 3124", 12986, TIPO_PROPIEDAD.DEPARTAMENTO);
		Propiedad p9 = new Propiedad("Av Panflin 847", 78453, TIPO_PROPIEDAD.PH);
		Propiedad p10 = new Propiedad("Blv San Isidro 1272", 89125, TIPO_PROPIEDAD.CASA);
		Propiedad p11 = new Propiedad("Av Sin Ideas 2132", 12123, TIPO_PROPIEDAD.DEPARTAMENTO);
		Propiedad p12 = new Propiedad("Av 9 de Julio 896", 17825, TIPO_PROPIEDAD.PH);

		// Linkeo de entidades

		i1.agregarBarrio(b1);
		i1.agregarBarrio(b2);

		i2.agregarBarrio(b3);
		i2.agregarBarrio(b4);

		b1.agregarPropiedad(p1);
		b1.agregarPropiedad(p2);
		b1.agregarPropiedad(p3);
		b2.agregarPropiedad(p4);
		b2.agregarPropiedad(p5);
		b2.agregarPropiedad(p6);

		b3.agregarPropiedad(p7);
		b3.agregarPropiedad(p8);
		b3.agregarPropiedad(p9);
		b3.agregarPropiedad(p10);
		b4.agregarPropiedad(p11);
		b4.agregarPropiedad(p12);

		// Testeo
		i1.mostrarPropiedades(); // Muestra todos (Barrio 1 y 2 completo)
		System.out.println(SEPARADOR);

		i2.mostrarPropiedades(TIPO_PROPIEDAD.DEPARTAMENTO); // Muestra solo Departamentos (p8 y p11)
		System.out.println(SEPARADOR);

		i1.mostrarBarrioMaxProp(); // Belgrano y Palermo (3)
		System.out.println(SEPARADORMINI);
		i2.mostrarBarrioMaxProp(); // Recoleta (4)
		System.out.println(SEPARADOR);

		i1.cambiarPropiedadDeBarrio(DOMICILIO1, b2);
		i1.mostrarBarrioMaxProp(); // Palermo (4), ya que el domicilio se cambio de Belgrano a Palermo
		System.out.println(SEPARADOR);

		System.out.println(i1.getNombre() + ":");
		i1.mostrarPropiedades(TIPO_PROPIEDAD.CASA);
		System.out.println(SEPARADORMINI);
		System.out.println(i2.getNombre() + ":");		i2.mostrarPropiedades(TIPO_PROPIEDAD.CASA);
		System.out.println("--- CAMBIO ---"); // Siemprevida 123 deberia pasar a la inmobiliaria 2
		System.out.println(i1.getNombre() + ":");
		i1.cambiarPropiedadDeBarrio(DOMICILIO1, b4);
		i1.mostrarPropiedades(TIPO_PROPIEDAD.CASA);
		System.out.println(SEPARADORMINI);
		System.out.println(i2.getNombre() + ":");
		i2.mostrarPropiedades(TIPO_PROPIEDAD.CASA);
		System.out.println(SEPARADOR);

		i1.borrarPropiedad(DOMICILIO2);
		i1.mostrarPropiedades(); // Comparando con el primer println, faltaría las primeras 2 propiedades. Ya que se borró DOMICILIO2, y DOMICILIO1 pertenece a un barrio que la inmobiliaria no tiene.
		System.out.println(SEPARADOR);

	}

}
