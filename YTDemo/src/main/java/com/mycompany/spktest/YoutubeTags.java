package com.mycompany.spktest;

import org.apache.hadoop.security.http.XFrameOptionsFilter;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class YoutubeTags {

    private static final String COMMA_DELIMITER = ",";
    private static String filePath = "src/main/resources/data/USvideos.csv";

    private static enum COLUMNS {
        VIDEO_ID, TREND_DATE, TITLE, CHANNEL_TITLE, CATEGORY_ID, PUBLISH_TIME, TAGS, VIEWS, LIKES, DISLIKES,
        COMMENT_COUNT, THUMB_LINK, COMMENTS_DISABLED, RATINGS_DISABLED, VIDEO_ERR, DESCRIPTION
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
//        FIXME a lot of garbage logging
        Logger.getLogger("org").setLevel(Level.ERROR);
        // TODO create SPARK context
        SparkConf conf = new SparkConf().setAppName("#Hashtag").setMaster("local[4]");
        JavaSparkContext context = new JavaSparkContext(conf);

        // TODO load dataset into RDD
        JavaRDD<String> videos = context.textFile(filePath);

        // TODO run transformation
//        JavaRDD<String> tagLines = videos.map(YoutubeTags::getTags)
//                .filter(t -> t.length > 0)
//                .flatMap(t -> Arrays.asList(t).iterator());

        JavaRDD<String> tags = videos.map(YoutubeTags::getTags)
                .filter(t -> t.length > 0)
                .flatMap(tag -> Arrays.asList(tag).iterator());
//                .flatMap(
//                        t -> Arrays.asList(t.toLowerCase().trim().replaceAll("\\p{Punct}", " ")
//                                .split(" ")).iterator()
//                );

//        TODO extract the data
        Map<String, Long> tagCount = tags.countByValue();
        List<Map.Entry<String, Long>> sorted
                = tagCount.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
        for(Map.Entry<String, Long> entry: sorted){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static String[] getTags(String videoLine) {
//        System.out.println("running tags");
        try {
            String tagLine = videoLine.split(COMMA_DELIMITER)[COLUMNS.TAGS.ordinal()];
            if (!tagLine.equals("[none]")) {
                return tagLine.split("\\\"\\|\\\"");
            }
            return new String[]{};
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            return new String[]{};
        }
    }
}
