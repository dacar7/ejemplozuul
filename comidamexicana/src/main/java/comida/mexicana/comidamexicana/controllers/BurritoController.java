package comida.mexicana.comidamexicana.controllers;

import comida.mexicana.comidamexicana.dominio.Burritos;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by David on 14/07/2018.
 */
@RestController
public class BurritoController {

  @RequestMapping(value="/burrito", method = RequestMethod.GET)
  public ResponseEntity<Burritos> consultarBurrito(){
    Burritos burritos = new Burritos();
    burritos.setIdBurrito(2);
    burritos.setTipoBurrito("Al Pastor");

    return ResponseEntity.ok(burritos);
  }

}
