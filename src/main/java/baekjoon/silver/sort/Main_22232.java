package baekjoon.silver.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main_22232 {
    public static int n, m;
    public static ArrayList<File> files;
    public static HashSet<String> fileExts;

    public static class File implements Comparable<File> {
        String fileOriName;
        String fileName;
        String extension;

        public File(String fileOriName) {
            this.fileOriName = fileOriName;
            getFileNameAndExts();
        }

        public void getFileNameAndExts() {
            String[] splitName = fileOriName.split("\\.");
            fileName = splitName[0];
            extension = splitName[1];
        }

        @Override
        public int compareTo(File file) {
            int result = this.fileName.compareTo(file.fileName);
            /**
             * 기준 값과 비교대상이 동일한 값일 경우 0
             * 기준 값이 비교대상 보다 작은 경우 -1
             * 기준 값이 비교대상 보다 큰 경우 1
             */
            if(result == 0 ) {
                int cur = fileExts.contains(this.extension) ? 0 : 1;
                int next = fileExts.contains(file.extension) ? 0 : 1;

                if(cur != next) {
                    result = cur - next;
                } else {
                    result = this.extension.compareTo(file.extension);
                }
            }

            return result;
        }
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        files = new ArrayList<File>();
        fileExts = new HashSet<String>();

        for(int i = 0; i < n; i++) {
            files.add(new File(br.readLine()));
        }
        for(int i = 0; i < m; i++) {
            fileExts.add(br.readLine());
        }

        Collections.sort(files);

        StringBuilder sb = new StringBuilder();

        for(File file : files) {
            sb.append(file.fileOriName).append("\n");
        }

        System.out.println(sb.toString());
    }
}
