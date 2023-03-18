package factory2;

public class JSMiddleware implements IMiddleware{
    @Override
    public void doPatch() {
        System.out.println("Javascript middleware is making the patch");
    }
}
