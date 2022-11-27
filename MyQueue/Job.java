/**
 *  job
 */
public class Job implements Comparable {

    private int job_id;
    private int job_size;
    private int priority_id;
    private int arrival_time;
    //
    private int status; //0=waiting,1=process,2=finish

    public Job(int job_id, int job_size, int priority_id, int arrival_time) {
        this.job_id = job_id;
        this.job_size = job_size;
        this.priority_id = priority_id;
        this.arrival_time = arrival_time;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    public int getStatus() {
        return status;
    }
    //
    public int getJobSize() {
        return job_size;
    }
    //
    public void setPriority(int priority_id) {
        this.priority_id = priority_id;
    }
    public int getPriority() {
        return priority_id;
    }

    public int compareTo(Object obj) {
        Job job = null;
        if (obj instanceof Job) {
            job = (Job) obj;
            return (job_size - job.getJobSize()); //if positive, the current is larger,negative smaller,0 equal
        }
        return 0;
    }

    public static void main(String...args) {
        try {
            MyQueueLinked q = new MyQueueLinked();

            Job job[] = new Job[5];

            job[0] = new Job(1, 1, 1, 1);
            job[1] = new Job(2, 10, 2, 2);
            job[2] = new Job(3, 89, 3, 3);
            job[3] = new Job(4, 9, 4, 4);
            job[4] = new Job(5, 150, 5, 5);

            System.out.println("Job:");
            
            int jobIncreaserOne = 1;
            
            for (int outer = 0; outer < job.length; outer++) {
                System.out.printf("Job #: " + jobIncreaserOne++ + " Job_size: " + job[outer].getJobSize() + " ");
                for (int j = outer + 1; j < job.length; j++) {
                    if (job[outer].compareTo(job[j]) > 0) {
                        Job newJob = job[outer];
                        job[outer] = job[j];
                        job[j] = newJob;
                    }
                }
                q.enqueue(job[outer]);

            }
            System.out.print(" ");
            System.out.println();
            // FOR DEQUEUE
            int jobIncreaserTwo = 1;
            int sizeLength = q.size();
            int j = 0;

            System.out.println("Ready Queue:");

            while (j < sizeLength) {
                Job work = (Job) q.dequeue();
                System.out.printf("Job #: " + jobIncreaserTwo++ + " Job_Size: " + work.getJobSize() + " ");
                j++;
            }
        } catch (Exception e) {
            System.out.print("ERROOOOORRRRRR!!!!!!");
        }



    }
} //end of class