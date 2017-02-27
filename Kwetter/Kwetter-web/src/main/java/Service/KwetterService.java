/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. test
 */
package Service;

import Dao.KwetterDAO;
import Domain.Kweet;
import Domain.User;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author jeffrey
 */
@Stateless
public class KwetterService {

    @Inject
    private KwetterDAO kwetterDAO;

    public void setKwetterDAO(KwetterDAO dao) {
        kwetterDAO = dao;
    }

    public void registerUser(User user) {

    }

    public void editUser(User user) {

    }

    public void followUser(User follower, User followee) {

    }

    public void unfollowUser(User follower, User followee) {

    }

    public void createKweet(Kweet kweet) {

    }
}
