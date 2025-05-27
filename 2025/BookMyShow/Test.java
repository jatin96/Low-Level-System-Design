class Test {
    @Autowired
    public Test(@Qualifier("service1") UserService service) {

    }
}




interface UserService {
    void method();
}

@Qualifier("service1")
class UserServiceImpl1 implements UserService {

}

@Qualifier("service2")
class UserServiceImpl2 implements UserService {

}

class UserServiceFactory {
    public UserServiceFactory() {

    }
}