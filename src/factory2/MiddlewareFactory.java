package factory2;

public class MiddlewareFactory {
    public IMiddleware getMiddleware(int which){
        switch(which) {
            case 1: return new JavaMiddleware();
            case 2: return new JSMiddleware();
            default: return new JavaMiddleware();
        }
    }
}
