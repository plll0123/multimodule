package org.example.exception;

/**
 * BizException은 비즈니스 로직에서 발생하는 예외를 처리하기 위한 클래스입니다.
 * 이 클래스는 RuntimeException을 상속받으므로 명시적인 예외 처리를 강제하지 않습니다.
 * 이 클래스는 해당 비즈니스 로직에 맞게 적절히 상속해야 해야하며, 필요에 따라 생성자를 정의해서 사용해야 합니다.
 * <p>
 * <strong>사용 예:</strong>
 * <pre>
 * {@code
 *   if (someBusinessConditionFailed) {
 *       throw new BizException("Business condition failed");
 *  *   }
 *  * }
 *  * </pre>
 *  *
 *  * @author 작성자의 이름 혹은 아이디
 *  * @version 1.0
 *  * @since 2023-09-07
 */
public class BizException extends RuntimeException {

    public BizException() {
    }

    /**
     * 예외 메시지를 지정할 수 있는 생성자입니다.
     * 지정된 메시지는 예외를 처리하는 곳에서 사용됩니다.
     * @param message
     */
    public BizException(String message) {
        super(message);
    }

    /**
     * 이 메소드는 성능 최적화를 위해 스택 트레이스를 채우지 않게 오버라이드 되었습니다.
     *
     * @return this - 스택 트레이스를 채우지 않는 현재 객체
     */
    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
}
