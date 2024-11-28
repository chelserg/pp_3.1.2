package com.example.springdemoapp.service;


import com.example.springdemoapp.dao.UserDao;
import com.example.springdemoapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import java.util.List;

@Service
public class UserServiceImp implements UserService {

   private final UserDao userDao;
@Autowired
   public UserServiceImp(UserDao userDao) {
      this.userDao = userDao;
   }

   @Transactional
   @Override
   public void add(User user) {
      userDao.add(user);
   }

   @Transactional
   @Override
   public void update(User user) {
      userDao.update(user);
   }

   @Transactional
   @Override
   public void delete(Long id) {
      userDao.delete(id);
   }

   @Override
   public List<User> findAll() {
      return userDao.findAll();
   }

   @Override
   public User findById(Long id) {
      return userDao.findById(id);
   }
}
