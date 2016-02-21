package jp.ditgroup.kazuaki.algorithm;

import jp.ditgroup.kazuaki.algorithm.common.NumberUtil;

public class Rounder {
	public static void main(String[] args) {
		
		double num = Integer.parseInt(args[0]);
		int keta = Integer.parseInt(args[1]);
		
		System.out.println(modRound(num, keta));
	}
	
	/**
	 * 四捨五入の計算を行う.
	 * keta が 0の場合は計算出来ない。
	 * @param num　四捨五入をする対象の数字
	 * @param keta 小数点何桁目を四捨五入するか※(桁数 - 1)が計算結果の桁数
	 * @return
	 */
	public static double modRound(double num, int keta) {
		long pow = NumberUtil.modPow(10, (keta - 1));
		double cal = num * pow;
		return (int)(cal + 0.5) / pow;
	}
}
