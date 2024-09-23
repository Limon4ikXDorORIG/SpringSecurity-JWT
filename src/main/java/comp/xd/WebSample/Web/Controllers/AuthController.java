package comp.xd.WebSample.Web.Controllers;

import comp.xd.WebSample.Web.Requests.SignInRequest;
import comp.xd.WebSample.Web.Requests.SignUpRequest;
import comp.xd.WebSample.Web.Responses.JwtAuthenticationResponse;
import comp.xd.WebSample.Web.Services.AuthenticationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
//@Tag(name = "Аутентификация")
public class AuthController {
    private final AuthenticationService authenticationService;

//    @Operation(summary = "Регистрация пользователя")
    @PostMapping("/sign-up")
    public JwtAuthenticationResponse signUp(@RequestBody @Valid SignUpRequest request) {
        return authenticationService.signUp(request);
    }

//    @Operation(summary = "Авторизация пользователя")
    @PostMapping("/sign-in")
    public JwtAuthenticationResponse signIn(@RequestBody @Valid SignInRequest request) {
        return authenticationService.signIn(request);
    }
}