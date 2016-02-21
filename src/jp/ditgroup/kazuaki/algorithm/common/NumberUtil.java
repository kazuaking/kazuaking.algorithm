package jp.ditgroup.kazuaki.algorithm.common;

public class NumberUtil {
	/**
	 * 与えられた引数からべき乗の計算を行う
	 * @param base 底数
	 * @param exponent 指数
	 * @return べき乗の計算結果
	 */
	public static long modPow(long base, long exponent) {
		long cal = base;
		for (int i = 1; i < exponent; i++) {
			cal = cal * base; 
		}
		// TODO: longの桁であふれる場合の挙動を確認して対応が必要なら対応する
		return cal;
	}
}
