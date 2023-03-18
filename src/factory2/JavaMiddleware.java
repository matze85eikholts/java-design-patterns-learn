package factory2;

public class JavaMiddleware implements IMiddleware{
    @Override
    public void doPatch() {
        System.out.println("Java middleware is making the patch");
    }
}
