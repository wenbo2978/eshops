package com.mycode.eshops.service.user;

import com.mycode.eshops.dto.UserDto;
import com.mycode.eshops.model.User;
import com.mycode.eshops.request.CreateUserRequest;
import com.mycode.eshops.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);

    User getAuthenticatedUser();
}
