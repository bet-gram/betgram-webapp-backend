package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Meili on 5/11/15.
 */
@Entity
public class Blog extends Model {

    @Id
    private Long Id;


    public static Finder<Long, Blog> find = new Finder<Long, Blog>(
            Long.class, Blog.class
    );
}
