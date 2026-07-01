package gianni.bussoletti.be_u2_s1_g1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BeU2S1G1ApplicationTests {

    @Test
    void contextLoads() {
    }

//	----------I TIPI DI TEST----------
//	UNIT TEST
//	I test unitari vanno a testare una specifica funzionalità
//
//	INTEGRATION TEST
//	Testo due funzionalità in maniera da vedere se funzionano
//	insieme dopo avere testate singolarmente

//	END 2 END TEST
//	Test che simulano flussi di lavoro da parte del cliente

//	ALTRI
//	Test di carico e performance - come risponde il back-end ad un carico di lavoro alto e "istantaneo"
//	Test di sicurezza - gestiti da figure professionali che testano la sicurezza di un programma.

//	jUnit
//	Libreria di Java per il test del codice.

//	I test hanno delle asserzioni, cioè delle "aspettative" da parte del programma che devono essere rispettate
//    assertEquals(expected, actual); - Questa asserzione verifica se il valore actual è uhuale al valore expected.
//    assertNotEquals(expected, actual); - Questa asserzione verifica se una condizione booleana è true.
//    assertTrue(expected, actual);
//    assertFalse(expected, actual);
//    assertNull(object); - Questa asserzione verifica se uno oggetto è nullo.
//    assertSame(expected, actual); - verifica se il riferimento all'oggetto actual è lo stesso del riferimento all'oggetto expected
//    assertArrayEquals(expected, actual); - Questa asserzione verifica se due array sono uguali.
//    assertThrows(exceptionType, executable): Questa asserzione verifica se l'esecuzione di un blocco di codice genera un'eccezione del tipo specificato.
//
//    assertAll Questo permette di raccogliere informazioni su tutti i problemi nel test invece di fermarsi alla prima asserzione fallita

//    Esistono delle annotazioni che vengono usate per gerare codice all'inizio di ogni test, durante il test e alla fine
//    @BeforeAll -> Si avvia prima di ogni pezzo di codice all'inizio, prima di qualsiasi test
//    @AfterAll -> Si avvia alla fine dopo tutti i test
//    @AfterEach -> Si avvia prima di ogni test
//    @BeforeEach -> si avvia dopo ogni singolo test

//    TEST AVANZATI CON JUNIT E BEST PRACTICES
//    Test parametrico
//    Sono test che permettono di eseguire lo stesso test con dati diversi passati tramite valori
//    @ParameterizedTest <- Serve per inizializzare un test parametrico
//    @§ValueSource <- annnotazione che fa passare i diversi valori come per esempio diverse lettere, parole o numeri singolarmente es.
//    CsvSource <- permette di passare parametri a 2 o più insieme. Serve se il test ha 2 o più test al suo interno.

//    Nomi parlanti ai test per creare un orientazione migliore con @DisplayName
//    I test devono essere ripetibili e isolati
//    Utilizzo stati conosciuti, meno random c'è più facile testare. Per esempio con un test di un DB è bene prepopolare il DB con dati conosciuti
//    Copertura dei casi limite; testare tutti i casi limite, inclusi casi di successo e quelli di fallimento.
}
