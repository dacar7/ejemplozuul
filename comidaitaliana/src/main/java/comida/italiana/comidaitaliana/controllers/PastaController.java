package comida.italiana.comidaitaliana.controllers;

import comida.italiana.comidaitaliana.dominio.Pasta;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by David on 14/07/2018.
 */
@RestController
public class PastaController {

  @RequestMapping(value = "/pasta", method = RequestMethod.GET)
  public ResponseEntity<Pasta> consultarPasta(){
    Pasta pasta = new Pasta();
    pasta.setIdPasta(1);
    pasta.setTipoPasta("Carbonara");

    return new ResponseEntity<Pasta>(pasta, null, HttpStatus.OK);
  }

}
