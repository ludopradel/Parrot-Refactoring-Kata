package parrot;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ParrotTest {

	@Test
    public void getSpeedOfEuropeanParrot() {
		Parrot parrot = new Parrot(ParrotTypeEnum.EUROPEAN, 0, 0, false);
		assertThat(parrot.getSpeed()).isEqualTo(12.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_One_Coconut() {
		Parrot parrot = new Parrot(ParrotTypeEnum.AFRICAN, 1, 0, false);
		assertThat(parrot.getSpeed()).isEqualTo(3.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_Two_Coconuts() {
		Parrot parrot = new Parrot(ParrotTypeEnum.AFRICAN, 2, 0, false);
		assertThat(parrot.getSpeed()).isEqualTo(0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_No_Coconuts() {
		Parrot parrot = new Parrot(ParrotTypeEnum.AFRICAN, 0, 0, false);
		assertThat(parrot.getSpeed()).isEqualTo(12.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_nailed() {
        Parrot parrot = new Parrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 0, true);
		assertThat(parrot.getSpeed()).isEqualTo(0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed() {
		Parrot parrot = new Parrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 1.5, false);
		assertThat(parrot.getSpeed()).isEqualTo(18.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed_high_voltage() {
		Parrot parrot = new Parrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 4, false);
		assertThat(parrot.getSpeed()).isEqualTo(24.0);
    }
}
