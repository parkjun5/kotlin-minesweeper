package mine.sweeper.domain.value

@JvmInline
value class MineCount(val value: Int) {
    init {
        require(value > 0)
    }
}
