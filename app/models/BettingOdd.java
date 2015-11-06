package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Meili on 5/11/15.
 */
@Entity
public class BettingOdd extends Model{

    @Id
    private Long Id;

}
