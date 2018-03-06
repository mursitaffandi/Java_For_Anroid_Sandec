public interface OnResult {
    abstract void OnSuccess(int result);
    void OnFailure(String message);
}
