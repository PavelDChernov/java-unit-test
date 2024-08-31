@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	// Напиши код здесь    
    final boolean expected = true;
    assertEquals("Передан возраст больше 18 лет (19)", expected, isAdult);
}
