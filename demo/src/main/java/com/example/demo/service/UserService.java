package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
// import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(String id, User updatedUser) {
        return userRepository.findById(id)
                .map(u -> {
                    updatedUser.setId(id);
                    return userRepository.save(updatedUser);
                })
                .orElse(null);
    }

    public boolean deleteUser(String id) {
        if (!userRepository.existsById(id))
            return false;
        userRepository.deleteById(id);
        return true;
    }
}

// package com.example.demo.service;

// import com.example.demo.model.User;
// import com.example.demo.repository.UserRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import java.util.List;

// @Service
// public class UserService {

// @Autowired
// private UserRepository userRepository;

// public List<User> getAllUsers() {
// return userRepository.findAll();
// }

// public User addUser(User user) {
// return userRepository.save(user);
// }

// public boolean deleteUser(Long id) {
// if (!userRepository.existsById(id)) {
// return false;
// }
// userRepository.deleteById(id);
// return true;
// }

// public User updateUser(Long id, User updatedUser) {
// if (!userRepository.existsById(id)) {
// return null;
// }
// updatedUser.setId(id);
// return userRepository.save(updatedUser);
// }
// }

// // package com.example.demo.service;

// // import com.example.demo.model.User;
// // import com.fasterxml.jackson.core.type.TypeReference;
// // import com.fasterxml.jackson.databind.ObjectMapper;
// // import org.springframework.stereotype.Service;

// // import java.io.File;
// // import java.nio.file.Paths;
// // import java.util.ArrayList;
// // import java.util.List;
// // import java.util.Objects;

// // @Service
// // public class UserService {

// // private final ObjectMapper mapper = new ObjectMapper();
// // private final String filePath = "src/main/resources/users.json";
// // private List<User> users;

// // public UserService() {
// // try {
// // File file = new File(filePath);
// // if (file.exists()) {
// // users = mapper.readValue(file, new TypeReference<List<User>>() {
// // });
// // } else {
// // users = new ArrayList<>();
// // saveUsers();
// // }
// // } catch (Exception e) {
// // users = new ArrayList<>();
// // saveUsers();
// // }
// // }

// // public List<User> getAllUsers() {
// // return users;
// // }

// // public User addUser(User user) {
// // long nextId = users.stream()
// // .map(User::getId)
// // .filter(Objects::nonNull)
// // .mapToLong(Long::valueOf)
// // .max()
// // .orElse(0L) + 1;
// // user.setId(nextId);
// // users.add(user);
// // saveUsers();
// // return user;
// // }

// // public boolean updateUser(Long id, User updatedUser) {
// // for (int i = 0; i < users.size(); i++) {
// // if (id != null && id.equals(users.get(i).getId())) {
// // updatedUser.setId(id);
// // users.set(i, updatedUser);
// // saveUsers();
// // return true;
// // }
// // }
// // return false;
// // }

// // public boolean deleteUser(Long id) {
// // boolean removed = users.removeIf(u -> id != null && id.equals(u.getId()));
// // if (removed)
// // saveUsers();
// // return removed;
// // }

// // private void saveUsers() {
// // try {
// // mapper.writerWithDefaultPrettyPrinter()
// // .writeValue(Paths.get(filePath).toFile(), users);
// // } catch (Exception e) {
// // e.printStackTrace();
// // }
// // }
// // }

// // // package com.example.demo.service;

// // // import com.example.demo.model.User;
// // // import com.fasterxml.jackson.core.type.TypeReference;
// // // import com.fasterxml.jackson.databind.ObjectMapper;
// // // import org.springframework.stereotype.Service;

// // // import java.io.File;
// // // import java.nio.file.Paths;
// // // import java.util.ArrayList;
// // // import java.util.List;

// // // @Service
// // // public class UserService {

// // // private final ObjectMapper mapper = new ObjectMapper();
// // // private final String filePath = "src/main/resources/users.json";
// // // private List<User> users;

// // // public UserService() {
// // // try {
// // // File file = new File(filePath);
// // // if (file.exists()) {
// // // users = mapper.readValue(file, new TypeReference<List<User>>() {
// // // });
// // // } else {
// // // users = new ArrayList<>();
// // // saveUsers(); // Save empty list initially
// // // }
// // // } catch (Exception e) {
// // // users = new ArrayList<>();
// // // }
// // // }

// // // public List<User> getAllUsers() {
// // // return users;
// // // }

// // // public void addUser(User user) {
// // // users.add(user);
// // // saveUsers();
// // // }

// // // public boolean deleteUser(Long id) {
// // // boolean removed = users.removeIf(user -> user.getId().equals(id));
// // // if (removed)
// // // saveUsers();
// // // return removed;
// // // }

// // // public void updateUser(Long id, User updatedUser) {
// // // for (int i = 0; i < users.size(); i++) {
// // // if (users.get(i).getId().equals(id)) {
// // // users.set(i, updatedUser);
// // // saveUsers();
// // // break;
// // // }
// // // }
// // // }

// // // private void saveUsers() {
// // // try {
// // //
// //
// mapper.writerWithDefaultPrettyPrinter().writeValue(Paths.get(filePath).toFile(),
// // // users);
// // // } catch (Exception e) {
// // // e.printStackTrace();
// // // }
// // // }
// // // }

// // // // package com.example.demo.service;

// // // // import com.example.demo.model.User;
// // // // import org.springframework.stereotype.Service;

// // // // import java.util.*;

// // // // @Service
// // // // public class UserService {
// // // // private Map<Long, User> users = new HashMap<>();

// // // // public Collection<User> getAllUsers() {
// // // // return users.values();
// // // // }

// // // // public void addUser(User user) {
// // // // users.put(user.getId(), user);
// // // // }

// // // // public boolean updateUser(Long id, String name) {
// // // // if (users.containsKey(id)) {
// // // // users.get(id).setName(name);
// // // // return true;
// // // // }
// // // // return false;
// // // // }

// // // // public boolean deleteUser(Long id) {
// // // // return users.remove(id) != null;
// // // // }
// // // // }
