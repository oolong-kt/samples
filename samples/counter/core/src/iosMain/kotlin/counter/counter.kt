package counter

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Runnable
import oolong.Oolong
import oolong.Render
import platform.darwin.dispatch_async
import platform.darwin.dispatch_get_main_queue
import kotlin.coroutines.CoroutineContext

fun Counter.runtime(render: Render<Counter.Msg, Counter.Props>) =
    Oolong.runtime(
        init,
        update,
        view,
        render,
        MainLoopDispatcher,
        MainLoopDispatcher,
        MainLoopDispatcher
    )

private object MainLoopDispatcher : CoroutineDispatcher() {
    override fun dispatch(context: CoroutineContext, block: Runnable) {
        dispatch_async(dispatch_get_main_queue()) {
            block.run()
        }
    }
}
