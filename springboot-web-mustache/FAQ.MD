
Springboot 학습을 하며 겪었던 내용을 정리해본다. 

### 오류1. springboot 2.0.2.RELEASE 버전에서 이런 오류가 발생 -> 1.5.4.RELEASE 버전으로 낮추니 해결되었다. 
> Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Circular view path [index]: would dispatch back to the current handler URL [/index] again. Check your ViewResolver setup! (Hint: This may be the result of an unspecified view, due to default view name generation.)] with root cause

해법 : 
```
	springBootVersion = '1.5.4.RELEASE'
```

---- 