
public abstract class animalitos {
	
		public abstract void avanzar();
		public abstract void hacerSonido();
	}


////////////////////////////////////////////////////////
	 class Perro extends animalitos {

	@Override
	public void avanzar() {
		System.out.println("El perro camina con sus 4 patas");
		
	}

	@Override
	public void hacerSonido() {
		System.out.println("¡Guau Guau!");
	}
		 
}
	
	class Pajaro extends animalitos {

		@Override
		public void avanzar() {
			System.out.println("El pajaro vuela, también puede caminar brincando con sus dos patas");
			
		}

		@Override
		public void hacerSonido() {
			System.out.println("¡Pio Pio!");
			
		}

	class Gato extends animalitos {

		@Override
		public void avanzar() {
			System.out.println("El gato camina con sus 4 patas");
			
		}

		@Override
		public void hacerSonido() {
			System.out.println("¡Miau Miau!");
			
		}
	}

	class Leon extends animalitos {

		@Override
		public void avanzar() {
			System.out.println("El leon camina con sus 4 patas");
			
		}

		@Override
		public void hacerSonido() {
			System.out.println("¡Grrrrr!");
			
		}
		
	}
		
	class Oveja extends animalitos {

		@Override
		public void avanzar() {
			System.out.println("La oveja camina con sus 4 patas")
			
		}

		@Override
		public void hacerSonido() {
			System.out.println("¡Beeeeee!")
			
		}
		
	}


	 
}
