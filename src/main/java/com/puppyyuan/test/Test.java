package com.puppyyuan.test;

/**
 * <p>Description: </p>
 *
 * @author yuanpeng
 * @date 2019/1/24
 */
public class Test {

    private static final String[] BANNER = { "",
            "  .   ____          _            __ _ _",
            " /\\\\ / ___'_ __ _ _(_)_ __  __ _ \\ \\ \\ \\",
            "( ( )\\___ | '_ | '_| | '_ \\/ _` | \\ \\ \\ \\",
            " \\\\/  ___)| |_)| | | | | || (_| |  ) ) ) )",
            "  '  |____| .__|_| |_|_| |_\\__, | / / / /",
            " =========|_|==============|___/=/_/_/_/" };


    public static void main(String[] args) {

        for (String line : BANNER) {
            System.out.println(line);
        }
    }
}
