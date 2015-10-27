package org.entitypedia.games.quanda.common.model;

import org.entitypedia.games.common.model.GameUser;

import java.io.Serializable;

/**
 * Quanda user information.
 *
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
public class QuandaUser extends GameUser implements Serializable {

    private static final long serialVersionUID = 1L;

    public QuandaUser() {
    }

    public QuandaUser(String uid) {
        // used by reflection in GameUserService.importUser
        super(uid);
    }
}